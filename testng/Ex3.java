package selenium.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ex3 {

	@Test
	public void testcase1() {
		System.out.println("tc1");	
	}
	@Test
	public void testcase2() {
		System.out.println("tc2");	
	}
	@BeforeSuite
	public void launch() {
		System.out.println("launch");	
	}
	@BeforeMethod
	public void quit() {
		System.out.println("quit");	

	}
}
