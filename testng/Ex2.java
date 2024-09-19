package selenium.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex2 {

	@Test
	public void testcase1() {
		System.out.println("TC1");	
	}
	@Test
	
	public void testcase2() {
		System.out.println("TC2");	

	}
	@BeforeMethod
	public void launch() {
		System.out.println("launch");	

	}
	@AfterMethod
	public void quit() {
		System.out.println("quit");	

	}
}
