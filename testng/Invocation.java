package selenium.testng;

import org.testng.annotations.Test;

public class Invocation {

	@Test(invocationCount=10)
	public void testcase1() {
		System.out.println("1");
		
	}
}
