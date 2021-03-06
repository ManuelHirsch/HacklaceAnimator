/*******************************************************************************
 * This program is made available under the terms of the GPLv3 or higher
 * which accompanies it and is available at http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package org.hacklace.animator.enums;

import org.hacklace.animator.ErrorContainer;
import org.hacklace.animator.FontUtil;

public enum PredefinedAnimation {
	ARROW('A', "Arrow", new int[] { //
			0x14, 0x2A, 0x49, 0x49, 0x3E, // frame 1
					0x00, 0x1C, 0x2A, 0x49, 0x3E, // frame 2
					0x00, 0x3E, 0x49, 0x3E, 0x08, // frame 3
					0x7F, 0x2A, 0x1C, 0x08, 0x08, // frame 4
					0x22, 0x1C, 0x08, 0x08, 0x08, // frame 5
					0x1C, 0x00, 0x08, 0x08, 0x08, // frame 6
					0x00, 0x08, 0x08, 0x08, 0x08, // frame 7
					0x08, 0x08, 0x08, 0x08, 0x00, // frame 8
					0x08, 0x08, 0x08, 0x00, 0x00, // frame 9
					0x08, 0x08, 0x00, 0x00, 0x00, // frame 10
					0x08, 0x00, 0x00, 0x00, 0x00, // frame 11
					0x00, 0x00, 0x00, 0x00, 0x0C, // frame 12
					0x00, 0x00, 0x00, 0x0C, 0x12, // frame 13
					0x00, 0x00, 0x0C, 0x12, 0x24, // frame 14
					0x00, 0x0C, 0x12, 0x24, 0x12, // frame 15
					0x0C, 0x12, 0x24, 0x12, 0x0C // frame 16
			}), //
	FIRE('B', "Fire", new int[] { //
			0x78, 0x5C, 0x68, 0x78, 0x71, // frame 1
					0x7C, 0x38, 0x74, 0x7C, 0x7A, // frame 2
					0x78, 0x50, 0x62, 0x62, 0x78, // frame 3
					0x7C, 0x60, 0x61, 0x70, 0x68, // frame 4
					0x7A, 0x60, 0x30, 0x78, 0x74, // frame 5
					0x70, 0x79, 0x70, 0x52, 0x69, // frame 6
					0x60, 0x7C, 0x68, 0x70, 0x61, // frame 7
					0x50, 0x66, 0x70, 0x78, 0x20, // frame 8
					0x68, 0x71, 0x60, 0x72, 0x50, // frame 9
					0x74, 0x79, 0x70, 0x62, 0x68, // frame 10
					0x72, 0x70, 0x30, 0x61, 0x74, // frame 11
					0x61, 0x78, 0x50, 0x70, 0x7A, // frame 12
					0x74, 0x31, 0x40, 0x68, 0x44, // frame 13
					0x10, 0x68, 0x70, 0x34, 0x60, // frame 14
					0x28, 0x4A, 0x60, 0x58, 0x60, // frame 15
					0x60, 0x70, 0x38, 0x66, 0x18, // frame 16
					0x60, 0x70, 0x78, 0x42, 0x19, // frame 17
					0x58, 0x64, 0x70, 0x29, 0x70, // frame 18
					0x70, 0x3A, 0x78, 0x54, 0x70, // frame 19
					0x70, 0x51, 0x78, 0x6A, 0x70, // frame 20
			}), //
	BOUNCE('C', "Bounce", new int[] { //
			0x01, 0x00, 0x00, 0x00, 0x00, // frame 1
					0x02, 0x02, 0x01, 0x00, 0x00, // frame 2
					0x06, 0x09, 0x09, 0x06, 0x00, // frame 3
					0x00, 0x30, 0x48, 0x48, 0x30, // frame 4
					0x00, 0x20, 0x50, 0x50, 0x20, // frame 5
					0x00, 0x30, 0x48, 0x48, 0x30, // frame 6
					0x00, 0x00, 0x06, 0x09, 0x09, // frame 7
					0x00, 0x00, 0x00, 0x01, 0x02, // frame 8
			}), //
	MOUNTAINRANGE('D', "Mountain Range", new int[] { //
			0x08, 0x44, 0x28, 0x10, 0x08, // frame 1
					0x04, 0x02, 0x04, 0x08, 0x50, // frame 2
					0x30, 0x10, 0x08, 0x04, 0x04, // frame 3
					0x02, 0x01, // frame 4
			}, //
			StepWidth.ONE), //
	SNOW('E', "Snow", new int[] { //
			0x01, 0x00, 0x00, 0x00, 0x00, // frame 1
					0x02, 0x00, 0x01, 0x00, 0x00, // frame 2
					0x04, 0x00, 0x02, 0x00, 0x00, // frame 3
					0x08, 0x01, 0x04, 0x00, 0x01, // frame 4
					0x10, 0x02, 0x08, 0x00, 0x02, // frame 5
					0x20, 0x04, 0x11, 0x00, 0x04, // frame 6
					0x41, 0x08, 0x22, 0x00, 0x08, // frame 7
					0x42, 0x10, 0x44, 0x01, 0x10, // frame 8
					0x45, 0x20, 0x48, 0x02, 0x20, // frame 9
					0x4A, 0x40, 0x50, 0x04, 0x41, // frame 10
					0x54, 0x40, 0x60, 0x08, 0x42, // frame 11
					0x68, 0x41, 0x60, 0x11, 0x44, // frame 12
					0x70, 0x42, 0x60, 0x22, 0x48, // frame 13
					0x70, 0x44, 0x60, 0x45, 0x50, // frame 14
					0x70, 0x48, 0x60, 0x4A, 0x50, // frame 15
					0x70, 0x50, 0x60, 0x54, 0x60, // frame 16
					0x70, 0x60, 0x60, 0x68, 0x60, // frame 17
					0x70, 0x60, 0x60, 0x70, 0x60, // frame 18
			}), //
	TUNNEL('F', "Tunnel", new int[] { //
			0x00, 0x00, 0x1C, 0x00, 0x00, // frame 1
					0x00, 0x3E, 0x22, 0x3E, 0x00, // frame 2
					0x7F, 0x41, 0x41, 0x41, 0x7F, // frame 3
			}), //
	WINK('G', "Wink", new int[] { //
			0x00, 0x26, 0x20, 0x26, 0x00, // frame 1
					0x00, 0x26, 0x20, 0x26, 0x00, // frame 2
					0x00, 0x26, 0x20, 0x26, 0x00, // frame 3
					0x00, 0x26, 0x20, 0x24, 0x00, // frame 4
					0x00, 0x26, 0x20, 0x26, 0x00, // frame 5
					0x00, 0x26, 0x20, 0x26, 0x00, // frame 6
					0x10, 0x26, 0x20, 0x26, 0x10, // frame 7
			}), //
	ECG('H', "ECG", new int[] { //
			0x10, 0x10, 0x10, 0x10, 0x10, // frame 1
					0x08, 0x10, 0x10, 0x0F, 0x70, // frame 2
					0x10, 0x10, 0x08, 0x08, 0x10, // frame 3
					0x10, 0x10, 0x10, 0x10, 0x10, // frame 4
			}, //
			StepWidth.ONE), //
	CHECKERS('I', "Checkers", new int[] { //
			0x55, 0x2A, 0x55, 0x2A, 0x55, // frame 1
					0x2A, 0x55, 0x2A, 0x55, 0x2A, // frame 2
			}), //
	TETRIS('J', "Tetris", new int[] { //
			0x00, 0x00, 0x07, 0x00, 0x00, // frame 1
					0x00, 0x00, 0x0E, 0x00, 0x00, // frame 2
					0x00, 0x08, 0x08, 0x08, 0x00, // frame 3
					0x10, 0x10, 0x10, 0x00, 0x00, // frame 4
					0x20, 0x20, 0x20, 0x00, 0x00, // frame 5
					0x40, 0x43, 0x43, 0x00, 0x00, // frame 6
					0x40, 0x46, 0x46, 0x00, 0x00, // frame 7
					0x40, 0x40, 0x4C, 0x0C, 0x00, // frame 8
					0x40, 0x40, 0x40, 0x18, 0x18, // frame 9
					0x40, 0x40, 0x40, 0x60, 0x60, // frame 10
					0x00, 0x00, 0x00, 0x20, 0x20, // frame 11
					0x40, 0x40, 0x40, 0x60, 0x60, // frame 12
					0x00, 0x01, 0x07, 0x44, 0x40, // frame 13
					0x00, 0x02, 0x0E, 0x48, 0x40, // frame 14
					0x00, 0x18, 0x08, 0x4C, 0x40, // frame 15
					0x30, 0x10, 0x18, 0x40, 0x40, // frame 16
					0x60, 0x20, 0x30, 0x40, 0x40, // frame 17
					0x60, 0x27, 0x34, 0x40, 0x40, // frame 18
					0x7E, 0x30, 0x30, 0x40, 0x40, // frame 19
					0x7E, 0x31, 0x33, 0x40, 0x40, // frame 20
					0x7E, 0x32, 0x36, 0x40, 0x40, // frame 21
					0x7E, 0x30, 0x36, 0x44, 0x40, // frame 22
					0x7E, 0x30, 0x30, 0x4C, 0x48, // frame 23
					0x7E, 0x30, 0x30, 0x50, 0x58, // frame 24
					0x7E, 0x30, 0x30, 0x60, 0x70, // frame 25
					0x5E, 0x10, 0x10, 0x40, 0x50, // frame 26
					0x7E, 0x30, 0x30, 0x60, 0x70, // frame 27
					0x7C, 0x20, 0x20, 0x40, 0x60, // frame 28
					0x7C, 0x21, 0x27, 0x44, 0x60, // frame 29
					0x7C, 0x22, 0x2E, 0x48, 0x60, // frame 30
					0x7C, 0x38, 0x28, 0x4C, 0x60, // frame 31
					0x7C, 0x3B, 0x2B, 0x4C, 0x60, // frame 32
					0x7C, 0x3E, 0x2E, 0x4C, 0x60, // frame 33
					0x7C, 0x3F, 0x2F, 0x4D, 0x60, // frame 34
			}), //
	GLIDER('K', "Glider", new int[] { //
			0x03, 0x00, 0x00, 0x00, 0x00, // frame 1
					0x03, 0x00, 0x00, 0x00, 0x00, // frame 2
					0x07, 0x00, 0x00, 0x00, 0x00, // frame 3
					0x06, 0x02, 0x00, 0x00, 0x00, // frame 4
					0x05, 0x06, 0x00, 0x00, 0x00, // frame 5
					0x0C, 0x06, 0x00, 0x00, 0x00, // frame 6
					0x08, 0x0E, 0x00, 0x00, 0x00, // frame 7
					0x0A, 0x0C, 0x04, 0x00, 0x00, // frame 8
					0x08, 0x0A, 0x0C, 0x00, 0x00, // frame 9
					0x04, 0x18, 0x0C, 0x00, 0x00, // frame 10
					0x08, 0x10, 0x1C, 0x00, 0x00, // frame 11
					0x00, 0x14, 0x18, 0x08, 0x00, // frame 12
					0x00, 0x10, 0x14, 0x18, 0x00, // frame 13
					0x00, 0x08, 0x30, 0x18, 0x00, // frame 14
					0x00, 0x10, 0x20, 0x38, 0x00, // frame 15
					0x00, 0x00, 0x28, 0x30, 0x10, // frame 16
					0x00, 0x00, 0x20, 0x28, 0x30, // frame 17
					0x00, 0x00, 0x00, 0x00, 0x00, // frame 18
					0x00, 0x00, 0x20, 0x28, 0x30, // frame 19
			}), //
	HOP('L', "Hop", new int[] { //
			0x20, 0x50, 0x50, 0x20, 0x00, // frame 1
					0x30, 0x48, 0x48, 0x30, 0x00, // frame 2
					0x06, 0x09, 0x09, 0x06, 0x00, // frame 3
					0x01, 0x02, 0x02, 0x01, 0x00, // frame 4
					0x00, 0x01, 0x01, 0x00, 0x00, // frame 5
			}), //
	PONG('M', "Pong", new int[] { //
			0x40, 0x40, 0x09, 0x01, 0x00, // frame 1
					0x00, 0x45, 0x41, 0x00, 0x00, // frame 2
					0x03, 0x01, 0x40, 0x40, 0x00, // frame 3
					0x05, 0x01, 0x40, 0x40, 0x00, // frame 4
					0x09, 0x41, 0x40, 0x00, 0x00, // frame 5
					0x50, 0x41, 0x01, 0x00, 0x00, // frame 6
					0x60, 0x41, 0x01, 0x00, 0x00, // frame 7
					0x40, 0x51, 0x01, 0x00, 0x00, // frame 8
					0x00, 0x41, 0x51, 0x00, 0x00, // frame 9
					0x00, 0x00, 0x41, 0x49, 0x00, // frame 10
					0x00, 0x00, 0x41, 0x41, 0x08, // frame 11
					0x00, 0x00, 0x40, 0x45, 0x01, // frame 12
					0x00, 0x00, 0x05, 0x41, 0x40, // frame 13
					0x00, 0x03, 0x01, 0x40, 0x40, // frame 14
					0x01, 0x05, 0x00, 0x40, 0x40, // frame 15
					0x00, 0x09, 0x01, 0x40, 0x40, // frame 16
					0x00, 0x10, 0x01, 0x41, 0x40, // frame 17
					0x00, 0x20, 0x41, 0x41, 0x00, // frame 18
					0x00, 0x40, 0x41, 0x41, 0x00, // frame 19
					0x00, 0x40, 0x41, 0x01, 0x00, // frame 20
			}), //
	HOUSE('N', "House", new int[] { //
			0x40, 0x40, 0x40, 0x40, 0x40, // frame 1
					0x40, 0x60, 0x50, 0x48, 0x44, // frame 2
					0x44, 0x64, 0x54, 0x4C, 0x44, // frame 3
					0x44, 0x6C, 0x54, 0x6C, 0x44, // frame 4
					0x44, 0x6C, 0x54, 0x6C, 0x7C, // frame 5
					0x44, 0x6C, 0x55, 0x6E, 0x7C, // frame 6
					0x44, 0x6E, 0x55, 0x6E, 0x7C, // frame 7
					0x7C, 0x6E, 0x55, 0x6E, 0x7C, // frame 8
			}), //
	ROCKET('O', "Rocket", new int[] { //
			0x40, 0x3C, 0x43, 0x3C, 0x40, // frame 1
					0x40, 0x7C, 0x43, 0x7C, 0x40, // frame 2
					0x40, 0x3C, 0x43, 0x3C, 0x40, // frame 3
					0x40, 0x7C, 0x43, 0x7C, 0x40, // frame 4
					0x40, 0x3C, 0x43, 0x3C, 0x40, // frame 5
					0x40, 0x7C, 0x43, 0x7C, 0x40, // frame 6
					0x20, 0x5E, 0x21, 0x5E, 0x20, // frame 7
					0x10, 0x6F, 0x10, 0x6F, 0x10, // frame 8
					0x08, 0x77, 0x08, 0x77, 0x08, // frame 9
					0x04, 0x7B, 0x04, 0x7B, 0x04, // frame 10
					0x02, 0x75, 0x02, 0x75, 0x02, // frame 11
					0x01, 0x68, 0x01, 0x68, 0x01, // frame 12
					0x20, 0x50, 0x20, 0x50, 0x20, // frame 13
					0x40, 0x10, 0x20, 0x00, 0x40, // frame 14
					0x20, 0x00, 0x40, 0x00, 0x40, // frame 15
					0x40, 0x00, 0x40, 0x00, 0x00, // frame 16
			}), //
	TRAIN('P', "Train", new int[] { //
			0x3F, 0x67, 0x64, 0x24, 0x66, // frame 1
					0x66, 0x24, 0x6F, 0x69, 0x69, // frame 2
					0x3F, 0x01, 0x00, 0x3C, 0x64, // frame 3
					0x66, 0x27, 0x67, 0x66, 0x3C, // frame 4
					0x00, 0x00, 0x21, 0x3F, 0x69, // frame 5
					0x69, 0x2F, 0x29, 0x29, 0x2F, // frame 6
					0x69, 0x69, 0x3F, 0x21, 0x00, // frame 7
					0x00, 0x20, 0x3E, 0x62, 0x62, // frame 8
					0x23, 0x23, 0x23, 0x62, 0x62, // frame 9
					0x3E, 0x20, 0x00, 0x00, 0x3C, // frame 10
					0x64, 0x7C, 0x24, 0x3C, 0x24, // frame 11
					0x3C, 0x24, 0x7C, 0x64, 0x3C, // frame 12
			}, //
			StepWidth.ONE), //
	EXPLODE('Q', "Explode", new int[] { //
			0x00, 0x02, 0x7D, 0x00, 0x00, // frame 1
					0x00, 0x01, 0x7C, 0x02, 0x00, // frame 2
					0x00, 0x00, 0x7A, 0x00, 0x00, // frame 3
					0x00, 0x08, 0x72, 0x04, 0x00, // frame 4
					0x00, 0x08, 0x60, 0x10, 0x00, // frame 5
					0x00, 0x10, 0x68, 0x00, 0x00, // frame 6
					0x00, 0x20, 0x40, 0x10, 0x00, // frame 7
					0x00, 0x00, 0x20, 0x00, 0x00, // frame 8
					0x00, 0x00, 0x00, 0x00, 0x00, // frame 9
					0x00, 0x00, 0x00, 0x00, 0x00, // frame 10
					0x00, 0x00, 0x00, 0x00, 0x00, // frame 11
					0x00, 0x00, 0x30, 0x00, 0x00, // frame 12
					0x00, 0x7C, 0x54, 0x38, 0x00, // frame 13
					0x79, 0x3D, 0x24, 0x3D, 0x79, // frame 14
					0x7B, 0x3F, 0x16, 0x3F, 0x7B, // frame 15
					0x7E, 0x7C, 0x18, 0x7C, 0x7E, // frame 16
					0x7C, 0x08, 0x10, 0x08, 0x7C, // frame 17
					0x70, 0x08, 0x10, 0x08, 0x70, // frame 18
					0x60, 0x08, 0x20, 0x10, 0x60, // frame 19
					0x10, 0x40, 0x00, 0x20, 0x00, // frame 20
			}), //
	DROPLET('R', "Droplet", new int[] { //
			0x40, 0x40, 0x41, 0x40, 0x40, // frame 1
					0x40, 0x40, 0x43, 0x40, 0x40, // frame 2
					0x40, 0x40, 0x45, 0x40, 0x40, // frame 3
					0x40, 0x40, 0x49, 0x40, 0x40, // frame 4
					0x40, 0x40, 0x51, 0x40, 0x40, // frame 5
					0x40, 0x40, 0x21, 0x40, 0x40, // frame 6
					0x40, 0x40, 0x51, 0x40, 0x40, // frame 7
					0x40, 0x48, 0x41, 0x48, 0x40, // frame 8
					0x48, 0x40, 0x41, 0x40, 0x48, // frame 9
					0x40, 0x40, 0x41, 0x40, 0x40, // frame 10
			}), //
	PSYCHO('S', "Psycho", new int[] { //
			0x1C, 0x3E, 0x77, 0x3E, 0x1C, // frame 1
					0x3E, 0x77, 0x63, 0x77, 0x3E, // frame 2
					0x77, 0x63, 0x41, 0x63, 0x77, // frame 3
					0x63, 0x41, 0x08, 0x41, 0x63, // frame 4
					0x41, 0x08, 0x1C, 0x08, 0x41, // frame 5
					0x08, 0x1C, 0x3E, 0x1C, 0x08, // frame 6
			}), //
	TV_OFF('T', "TV off", new int[] { //
			0x7F, 0x7F, 0x7F, 0x7F, 0x7F, // frame 1
					0x1C, 0x1C, 0x1C, 0x1C, 0x1C, // frame 2
					0x08, 0x08, 0x08, 0x08, 0x08, // frame 3
					0x08, 0x08, 0x08, 0x08, 0x08, // frame 4
					0x00, 0x08, 0x08, 0x08, 0x00, // frame 5
					0x00, 0x00, 0x08, 0x00, 0x00, // frame 6
			}), //
	CLOCK('U', "Clock", new int[] { //
			0x1C, 0x22, 0x2E, 0x2A, 0x1C, // frame 1
					0x1C, 0x22, 0x2A, 0x2E, 0x1C, // frame 2
					0x1C, 0x22, 0x2A, 0x2A, 0x1C, // frame 3
					0x1C, 0x22, 0x2A, 0x3A, 0x1C, // frame 4
					0x1C, 0x22, 0x3A, 0x2A, 0x1C, // frame 5
					0x1C, 0x32, 0x2A, 0x2A, 0x1C, // frame 6
					0x1C, 0x2A, 0x2A, 0x2A, 0x1C, // frame 7
					0x1C, 0x26, 0x2A, 0x2A, 0x1C, // frame 8
			}), //
	LADY('V', "Lady", FontUtil.getIntsForRawString("unsupported", null), StepWidth.ONE), //
	INVALID('?', "Invalid", FontUtil.getIntsForRawString("invalid", null), StepWidth.ONE) //
	; // end

	public final static char MIN = 'A';
	public final static char MAX = 'V';

	private final char index;
	private final String name;
	private final int[] animationBytes;
	private final StepWidth defaultStepWidth;

	private PredefinedAnimation(char index, String name, int[] animationBytes) {
		this.index = index;
		this.name = name;
		this.animationBytes = animationBytes;
		this.defaultStepWidth = StepWidth.FIVE;
	}
	
	private PredefinedAnimation(char index, String name, int[] animationBytes, StepWidth defaultStepWidth) {
		this.index = index;
		this.name = name;
		this.animationBytes = animationBytes;
		this.defaultStepWidth = defaultStepWidth;
	}	

	public char getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}

	public int[] getAnimationBytes() {
		return animationBytes;
	}

	public StepWidth getDefaultStepWidth() {
		return defaultStepWidth;
	}
	
	@Override
	public String toString() {
		return "~" + index + ": " + name;
	}

	/**
	 * Returns the Predefined Animation
	 * 
	 * @param index
	 *            Letter from 'A' to 'V' 
	 * @return
	 */
	public static PredefinedAnimation getPredefinedAnimationByIndex(char index,
			ErrorContainer errorContainer) {
		PredefinedAnimation[] animations = PredefinedAnimation.values();
		if (isInvalid(index, errorContainer))
			return INVALID;
		int intIndex = index - 'A';
		return animations[intIndex];
	}

	/**
	 * 
	 * @param c
	 * @return true for upper case A to V
	 */
	public static boolean isValid(char c, ErrorContainer errorContainer) {
		if (MIN <= c && c <= MAX) {
			return true;
		}
		errorContainer.addError("Reference animation (~" + c
				+ ") is not valid. Needs to be upper case between ~"
				+ PredefinedAnimation.MIN + " and ~" + PredefinedAnimation.MAX
				+ " (inclusive).");
		return false;
	}

	/**
	 * 
	 * @param c
	 * @return false for upper case A to V
	 */
	public static boolean isInvalid(char c, ErrorContainer errorContainer) {
		return !isValid(c, errorContainer);
	}
	
	public static PredefinedAnimation[] getList() {
		PredefinedAnimation[] all = values();
		PredefinedAnimation[] withoutVAndInvalid = new PredefinedAnimation[all.length-2];
		System.arraycopy(all, 0, withoutVAndInvalid, 0, withoutVAndInvalid.length);
		return withoutVAndInvalid;
	}


}
