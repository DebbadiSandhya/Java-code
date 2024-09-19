
//199.WAP with two parameters(priority,invocation Count)
package selenium.testng;

import org.testng.annotations.Test;

public class Ass_199 {
	@Test(priority=4)
	public void logout() {
		System.out.println("logged out");
	}
	@Test
	public void login() {
		System.out.println("logged in");

	}
	@Test(priority=2, invocationCount=3)
	public void search() {
		System.out.println("searching");

	}
	@Test(priority=3, invocationCount=2 )
	public void addtocart() {
		System.out.println("add to cart");

	}
}
