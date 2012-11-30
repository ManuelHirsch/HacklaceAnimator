package org.hacklace.animator.gui;


public class FontUtil {
	
    public final static int LOWEST_INDEX = 0x20;
    public final static int HIGHEST_INDEX = 0xAF;

	private final static int[][] HACKLACE_CHARSET = {
		{ 0x00, 0x00, 0x00, 0x80, 0x80 },
		{ 0x5F, 0x80, 0x80, 0x80, 0x80 },
		{ 0x03, 0x00, 0x03, 0x80, 0x80 },
		{ 0x14, 0x7F, 0x14, 0x7F, 0x14 },
		{ 0x24, 0x2A, 0x7F, 0x2A, 0x12 },
		{ 0x23, 0x13, 0x08, 0x64, 0x62 },
		{ 0x36, 0x49, 0x56, 0x20, 0x50 },
		{ 0x05, 0x03, 0x80, 0x80, 0x80 },
		{ 0x1C, 0x22, 0x41, 0x80, 0x80 },
		{ 0x41, 0x22, 0x1C, 0x80, 0x80 },
		{ 0x22, 0x14, 0x6B, 0x14, 0x22 },
		{ 0x08, 0x08, 0x3E, 0x08, 0x08 },
		{ 0x50, 0x30, 0x80, 0x80, 0x80 },
		{ 0x08, 0x08, 0x08, 0x08, 0x80 },
		{ 0x60, 0x60, 0x80, 0x80, 0x80 },
		{ 0x60, 0x10, 0x08, 0x04, 0x03 },
		{ 0x3E, 0x41, 0x41, 0x3E, 0x80 },
		{ 0x42, 0x7F, 0x40, 0x80, 0x80 },
		{ 0x62, 0x51, 0x49, 0x46, 0x80 },
		{ 0x22, 0x41, 0x49, 0x36, 0x80 },
		{ 0x18, 0x14, 0x12, 0x7F, 0x80 },
		{ 0x27, 0x45, 0x45, 0x39, 0x80 },
		{ 0x3C, 0x4A, 0x49, 0x31, 0x80 },
		{ 0x01, 0x71, 0x0D, 0x03, 0x80 },
		{ 0x36, 0x49, 0x49, 0x36, 0x80 },
		{ 0x06, 0x49, 0x29, 0x1E, 0x80 },
		{ 0x36, 0x36, 0x80, 0x80, 0x80 },
		{ 0x56, 0x36, 0x80, 0x80, 0x80 },
		{ 0x08, 0x14, 0x22, 0x41, 0x80 },
		{ 0x14, 0x14, 0x14, 0x14, 0x80 },
		{ 0x41, 0x22, 0x14, 0x08, 0x80 },
		{ 0x02, 0x51, 0x09, 0x06, 0x80 },
		{ 0x32, 0x49, 0x79, 0x41, 0x3E },
		{ 0x7E, 0x09, 0x09, 0x7E, 0x80 },
		{ 0x7F, 0x49, 0x49, 0x36, 0x80 },
		{ 0x3E, 0x41, 0x41, 0x22, 0x80 },
		{ 0x7F, 0x41, 0x41, 0x3E, 0x80 },
		{ 0x7F, 0x49, 0x49, 0x41, 0x80 },
		{ 0x7F, 0x09, 0x09, 0x01, 0x80 },
		{ 0x3E, 0x49, 0x49, 0x3A, 0x80 },
		{ 0x7F, 0x08, 0x08, 0x7F, 0x80 },
		{ 0x41, 0x7F, 0x41, 0x80, 0x80 },
		{ 0x20, 0x40, 0x40, 0x3F, 0x80 },
		{ 0x7F, 0x08, 0x14, 0x63, 0x80 },
		{ 0x7F, 0x40, 0x40, 0x40, 0x80 },
		{ 0x7F, 0x02, 0x0C, 0x02, 0x7F },
		{ 0x7F, 0x06, 0x18, 0x7F, 0x80 },
		{ 0x3E, 0x41, 0x41, 0x3E, 0x80 },
		{ 0x7F, 0x09, 0x09, 0x06, 0x80 },
		{ 0x3E, 0x41, 0x21, 0x5E, 0x80 },
		{ 0x7F, 0x09, 0x19, 0x66, 0x80 },
		{ 0x26, 0x49, 0x49, 0x32, 0x80 },
		{ 0x01, 0x01, 0x7F, 0x01, 0x01 },
		{ 0x3F, 0x40, 0x40, 0x3F, 0x80 },
		{ 0x07, 0x18, 0x60, 0x18, 0x07 },
		{ 0x3F, 0x40, 0x38, 0x40, 0x3F },
		{ 0x63, 0x14, 0x08, 0x14, 0x63 },
		{ 0x03, 0x04, 0x78, 0x04, 0x03 },
		{ 0x61, 0x59, 0x45, 0x43, 0x80 },
		{ 0x7F, 0x41, 0x41, 0x80, 0x80 },
		{ 0x03, 0x04, 0x08, 0x10, 0x60 },
		{ 0x41, 0x41, 0x7F, 0x80, 0x80 },
		{ 0x02, 0x01, 0x02, 0x80, 0x80 },
		{ 0x40, 0x40, 0x40, 0x40, 0x80 },
		{ 0x03, 0x04, 0x80, 0x80, 0x80 },
		{ 0x20, 0x54, 0x54, 0x78, 0x80 },
		{ 0x7F, 0x48, 0x48, 0x30, 0x80 },
		{ 0x38, 0x44, 0x44, 0x28, 0x80 },
		{ 0x38, 0x44, 0x44, 0x7F, 0x80 },
		{ 0x38, 0x54, 0x54, 0x48, 0x80 },
		{ 0x04, 0x7E, 0x05, 0x01, 0x80 },
		{ 0x48, 0x54, 0x54, 0x38, 0x80 },
		{ 0x7F, 0x08, 0x08, 0x70, 0x80 },
		{ 0x7A, 0x80, 0x80, 0x80, 0x80 },
		{ 0x20, 0x40, 0x3A, 0x80, 0x80 },
		{ 0x7F, 0x08, 0x14, 0x62, 0x80 },
		{ 0x41, 0x7F, 0x40, 0x80, 0x80 },
		{ 0x7C, 0x04, 0x78, 0x04, 0x78 },
		{ 0x7C, 0x04, 0x04, 0x78, 0x80 },
		{ 0x38, 0x44, 0x44, 0x38, 0x80 },
		{ 0x7C, 0x24, 0x24, 0x18, 0x80 },
		{ 0x18, 0x24, 0x24, 0x7C, 0x80 },
		{ 0x78, 0x04, 0x04, 0x80, 0x80 },
		{ 0x48, 0x54, 0x54, 0x24, 0x80 },
		{ 0x04, 0x3F, 0x44, 0x44, 0x80 },
		{ 0x3C, 0x40, 0x40, 0x7C, 0x80 },
		{ 0x0C, 0x30, 0x40, 0x30, 0x8C },
		{ 0x3C, 0x40, 0x30, 0x40, 0x3C },
		{ 0x44, 0x28, 0x10, 0x28, 0x44 },
		{ 0x4C, 0x50, 0x50, 0x3C, 0x80 },
		{ 0x64, 0x54, 0x4C, 0x44, 0x80 },
		{ 0x08, 0x36, 0x41, 0x80, 0x80 },
		{ 0x7F, 0x80, 0x80, 0x80, 0x80 },
		{ 0x41, 0x36, 0x08, 0x80, 0x80 },
		{ 0x08, 0x04, 0x08, 0x10, 0x08 },
		{ 0x80, 0x80, 0x80, 0x80, 0x80 },
		{ 0x1C, 0x2A, 0x49, 0x49, 0x22 },
		{ 0x1F, 0x04, 0x7F, 0x40, 0x40 },
		{ 0x20, 0x12, 0x10, 0x12, 0x20 },
		{ 0x10, 0x22, 0x20, 0x22, 0x10 },
		{ 0x21, 0x54, 0x54, 0x79, 0x80 },
		{ 0x79, 0x14, 0x14, 0x79, 0x80 },
		{ 0x39, 0x44, 0x44, 0x39, 0x80 },
		{ 0x39, 0x44, 0x44, 0x39, 0x80 },
		{ 0x3D, 0x40, 0x40, 0x7D, 0x80 },
		{ 0x3D, 0x40, 0x40, 0x3D, 0x80 },
		{ 0x7E, 0x25, 0x25, 0x1A, 0x80 },
		{ 0x6C, 0x1A, 0x6F, 0x1A, 0x6C },
		{ 0x7D, 0x5A, 0x1E, 0x5A, 0x7D },
		{ 0x4E, 0x7B, 0x0F, 0x7B, 0x4E },
		{ 0x7C, 0x3A, 0x7E, 0x3A, 0x7C },
		{ 0x1C, 0x76, 0x2E, 0x76, 0x1C },
		{ 0x1E, 0x34, 0x7C, 0x34, 0x1E },
		{ 0x0C, 0x12, 0x24, 0x12, 0x0C },
		{ 0x08, 0x1C, 0x3E, 0x7F, 0x80 },
		{ 0x7F, 0x3E, 0x1C, 0x08, 0x80 },
		{ 0x30, 0x3F, 0x01, 0x62, 0x7E },
		{ 0x30, 0x3F, 0x02, 0x80, 0x80 },
		{ 0x1E, 0x3D, 0x77, 0x73, 0x31 },
		{ 0x60, 0x7E, 0x7B, 0x7E, 0x60 },
		{ 0x20, 0x5F, 0x23, 0x80, 0x80 },
		{ 0x7E, 0x7A, 0x7A, 0x7F, 0x80 },
		{ 0x03, 0x45, 0x79, 0x45, 0x03 },
		{ 0x10, 0x28, 0x24, 0x28, 0x10 },
		{ 0x08, 0x14, 0x2A, 0x14, 0x08 },
		{ 0x00, 0x00, 0x00, 0x00, 0x00 },
		{ 0x36, 0x36, 0x08, 0x36, 0x36 },
		{ 0x1E, 0x14, 0x3C, 0x28, 0x78 },
		{ 0x44, 0x24, 0x1D, 0x24, 0x44 },
		{ 0x42, 0x24, 0x1D, 0x62, 0x01 },
		{ 0x08, 0x65, 0x1C, 0x22, 0x41 },
		{ 0x46, 0x24, 0x1D, 0x24, 0x4C },
		{ 0x08, 0x44, 0x3D, 0x44, 0x08 },
		{ 0x4C, 0x24, 0x1D, 0x24, 0x46 },
		{ 0x01, 0x62, 0x1D, 0x62, 0x01 },
		{ 0x42, 0x24, 0x1D, 0x24, 0x42 },
		{ 0x7C, 0x46, 0x57, 0x46, 0x7C },
		{ 0x7F, 0x2A, 0x2A, 0x7F, 0x80 },
		{ 0x2A, 0x7F, 0x41, 0x7F, 0x2A },
		{ 0x0A, 0x00, 0x55, 0x00, 0x0A },
		{ 0x30, 0x48, 0x4D, 0x33, 0x07 },
		{ 0x06, 0x29, 0x79, 0x29, 0x06 },
		{ 0x08, 0x1C, 0x2A, 0x08, 0x08 },
		{ 0x08, 0x08, 0x2A, 0x1C, 0x08 }};
	
	public static int[] getFiveBytesForIndex(int index) {
		return HACKLACE_CHARSET[index-LOWEST_INDEX];
	}
	
	public static int[] getFiveBytesForChar(char c) {
		int n = (int) '?';
		// ASCII
		if (c >= 0x20 && c < 0x80) {
			n = (int) c;
		}
		switch (c) {
			case '€' : n = 0x80;break;
			case 'ä' : n = 0x84;break;
			case 'Ä' : n = 0x85;break;
			case 'ö' : n = 0x86;break;
			case 'Ö' : n = 0x87;break;
			case 'ü' : n = 0x88;break;
			case 'Ü' : n = 0x89;break;
			case 'ß' : n = 0x8A;break;
		}
		return getFiveBytesForIndex(n);
	}
	
	/**
	 * 
	 * @param special two-character String, first char is ^
	 * @return € for ^A etc.
	 */
	public static int[] getFiveBytesForSpecial(String special) {
		assert(special.length() == 2);
		char c = special.charAt(1);
		return getFiveBytesForSpecial(c);
	}

	public static int[] getFiveBytesForSpecial(char c) {
		int index = c + 63;
		return getFiveBytesForIndex(index);
	}	

}
