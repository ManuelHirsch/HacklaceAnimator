/*******************************************************************************
 * This program is made available under the terms of the GPLv3 or higher
 * which accompanies it and is available at http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package org.hacklace.animator;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class IniConfigurationTest extends TestCase {
	
	private IniConf conf;
	
	@Override
	protected void setUp() {
		conf = new IniConf("/test_animatorconf.ini"); 
	}
	
	@Override
	protected void tearDown() {
		conf = null;
	}
	
	public void testGridConf() {
		assertEquals(7, conf.rows());
		assertEquals(5, conf.columns());
	}
	
	public void testDisplayConf() {
		assertEquals(500, conf.displayHeight());
		assertEquals(980, conf.displayWidth());
	}
	
	public void testFlashConf() {
		assertEquals(2400, conf.baud());
	}
	
	public void testAnimationConf() {
		List<Integer> delayList = Arrays.asList(0, 1, 2, 3, 5, 8, 13, 21);
		List<Integer> speedList = Arrays.asList(50, 30, 18, 11, 7, 5, 3, 2);
		assertEquals(speedList, conf.speedList());
		assertEquals(delayList, conf.delayList());
	}
	

}
