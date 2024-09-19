package selenium.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	@Test
	public void testcase1(){
		Assert.assertTrue(true);
		
	}
	@Test
	public void testcase2() {
		Assert.assertTrue(false);

	}
	@Test
	public void testcase3() {
		Assert.assertFalse(false);
	}
	@Test
	public void testcase4() {
		Assert.assertFalse(true);
	}
	@Test
	public void testcase5() {
		Assert.assertFalse(true, "sorry but TC fails");
	}
	@Test
	public void testcase6() {
		Assert.assertFalse(false,"TC passed");
	}
}
