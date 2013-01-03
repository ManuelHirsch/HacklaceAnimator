package org.hacklace.animator;

import java.io.ByteArrayOutputStream;

import org.hacklace.animator.configuration.DirectMode;

public class ConversionUtil {

	/**
	 * 
	 * @param threeCharString
	 *            three characters $nn where n is hex (0-F)
	 * @return the byte represented by this (-128 to 127)
	 */
	public static byte convertStringToByte(String threeCharString) {
		return (byte) convertStringToInt(threeCharString);
	}

	/**
	 * 
	 * @param threeCharString
	 *            three characters $nn where n is hex (0-F)
	 * @return the byte represented by this (0 to 255)
	 */
	public static int convertStringToInt(String threeCharString) {
		assert (threeCharString.length() == 3);
		assert (threeCharString.charAt(0) == '$');
		return Integer.parseInt(threeCharString.substring(1), 16);
	}

	/**
	 * 
	 * @param potentialHexString
	 *            a String of length 3
	 * @return true if string is $nn with n hex (0-F), false if the length of
	 *         the String is not 3 or if it does not start with $ or if the last
	 *         two chars are not hex
	 */
	public static boolean isHexSequence(String potentialHexString) {
		if (potentialHexString.length() != 3)
			return false;
		return potentialHexString.matches("^\\$[0-9A-F]{2}$");
		// ...................................$nn (exactly 3 chars)
	}

	/**
	 * 
	 * @param number
	 *            -128 to 127
	 * @return $nn, a String of length 4
	 */
	public static String convertByteToString(byte number) {
		int value = number;
		if (value < 0)
			value += 256;
		String leadingZero = (value < 0x10) ? "0" : "";
		return "$" + leadingZero + Integer.toString(value, 16).toUpperCase()
				+ ",";
	}

	/**
	 * 
	 * @param numbers
	 * @return e.g. "$74 $28 $32 " (always a trailing space)
	 */
	public static String convertBytesToString(byte[] numbers) {
		StringBuilder sb = new StringBuilder();
		for (byte number : numbers) {
			sb.append(convertByteToString(number));
		}
		return sb.toString();
	}

	/**
	 * 
	 * @param directMode
	 *            without the direct mode bytes ($FF)
	 * @return a byte array with one byte for each hex sequence
	 * @throws IllegalHacklaceConfigLineException
	 */
	public static byte[] convertAnimationStringToByteArray(DirectMode directMode) {
		String aniString = directMode.getValue();
		byte[] aniBytes = new byte[200];
		String[] aniByteStrings = aniString.split(IniConf.separatorsRegEx);

		int index = 0;
		for (String aniByteString : aniByteStrings) {
			byte aniByte = ConversionUtil.convertStringToByte(aniByteString);
			aniBytes[index] = aniByte;
			index++;
		}
		return aniBytes;
	}

	/**
	 * The first bit (bit 7) is assumed to be 0 (should be the case for
	 * animation bytes)
	 * 
	 * @param aniByte
	 * @return array with 7 booleans
	 */
	public static boolean[] convertAnimationByteTo7Booleans(byte aniByte) {
		byte mask = 64; // 0100 0000
		boolean[] returnArray = new boolean[7];
		for (int row = 6; row >= 0; row--) {
			byte maskResult = (byte) (mask & aniByte);
			returnArray[row] = ((maskResult != 0) ? true : false);
			mask >>= 1;
		}
		return returnArray;
	}

	public static byte convertBooleanArrayToByte(boolean[] array) {
		// bit 0 in array = top pixel = bit 0 (right) in byte,
		// bit 6 in array = bottom pixel = bit 6 (left) in byte
		int value = 0;
		int power = 1;
		for (boolean bool : array) {
			if (bool)
				value += power; // set next bit
			power *= 2;
		}
		return (byte) value;
	}

	public static boolean isBitSet(byte bits, int index) {
		final byte mask = (byte) Math.pow(2, index);
		byte result = (byte) (mask & bits);
		if (result == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Converts a string representing an animation line to a byte array the same
	 * way the hacklace does when flashing. We are only using a subset of the
	 * functionality though because we are working on lines, not full files.
	 * 
	 * @see https://github.com/fabster/Hacklace/blob/master/Hacklace.c
	 * @param s
	 * @return
	 */
	private enum FlashState {
		EE_NORMAL, EE_SPECIAL_CHAR, EE_HEX_CODE;
	}

	public static byte[] convertFlashStringToBytes(String s) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		FlashState state = FlashState.EE_NORMAL; // start after the escape
													// sequences have been
													// received
		char val = 0;
		loop: for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			switch (state) {
			case EE_NORMAL:
				if (ch == '^') {
					state = FlashState.EE_SPECIAL_CHAR;
				} else if (ch == '$') {
					val = 0;
					state = FlashState.EE_HEX_CODE;
				} else if (ch == 10 || ch == 13) {
					break loop;
				} // EOL, we do not represent this as \0 but stop here
				else if (ch >= ' ') {
					baos.write(ch);
				}
				break;
			case EE_SPECIAL_CHAR:
				baos.write(ch + 63);
				state = FlashState.EE_NORMAL;
				break;
			case EE_HEX_CODE:
				if (ch >= 'A') {
					ch -= ('A' - '9' - 1);
				}
				ch -= '0'; // map characters '0'..'9' and 'A'..'F' to values
							// 0..15
				if (ch > 15) { // any character below '0' or above 'F'
								// terminates hex input
					baos.write(val);
					state = FlashState.EE_NORMAL;
				} else {
					val <<= 4;
					val += ch;
				}
				break;
			}
		}
		return baos.toByteArray();
	}

}
