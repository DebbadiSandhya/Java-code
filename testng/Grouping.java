package selenium.testng;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups= {"smoke","system"})
	public void TC1() {
		System.out.println("1");
		
		}
	@Test(groups= {"smoke"})
	public void TC2() {
		System.out.println("2");

	}
	@Test(groups= {"smoke"})
	public void TC3() {
		System.out.println("3");

	}
	@Test(groups= {"smoke"})
	public void TC4() {
		System.out.println("4");

	}
	@Test(groups= {"smoke", "system"})
	public void TC5() {
		System.out.println("5");

	}
}
