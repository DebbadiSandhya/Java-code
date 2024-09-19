package selenium.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ex4 {

	@Test
	public void testcase1() {
		System.out.println("TC1");	
	}
	@Test
	public void testcase2() {
		System.out.println("TC2");	
	}
	@Test
	public void testcase3() {
		System.out.println("TC3");	
	}
	@BeforeSuite
	public void launch() {
		System.out.println("launch");	
	}
	@AfterSuite
	public void search() {
		System.out.println("search");	
	}
	@AfterMethod
	public void cart() {
		System.out.println("cart");	
	}
}
