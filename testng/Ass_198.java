
//198.WAP with 4 @Test and the test annotation have the priority as  4,3,2 and not mentioned.
package selenium.testng;

import org.testng.annotations.Test;

public class Ass_198 {
 
	@Test(priority=4)
	public void logout() {
		System.out.println("logged out");
	}
	@Test
	public void login() {
		System.out.println("logged in");

	}
	@Test(priority=2)
	public void search() {
		System.out.println("searching");

	}
	@Test(priority=3)
	public void addtocart() {
		System.out.println("add to cart");

	}
}
