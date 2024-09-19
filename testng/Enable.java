package selenium.testng;

import org.testng.annotations.Test;

public class Enable {

	@Test(enabled=true)
	public void Testcase1() {
		System.out.println("launch");	

	}
	@Test
	public void Testcase2() {
		System.out.println("Search");	

	}
	@Test(enabled=false)  //this will not execute because we disabled @test//
	public void Testcase3() {
		System.out.println("cart");	

	}
}
