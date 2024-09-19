
//197.WAP with  3 @Test and the priority is 0,-1,and 1
package selenium.testng;

import org.testng.annotations.Test;

public class Ass_197 {

	@Test(priority=1)
	public void login() {
		System.out.println("logged in");
	}
	@Test(priority=-1)
	public void Search() {
		System.out.println("Searching");

	}
	@Test(priority=0)
	public void logout() {
		System.out.println("logged out");

	}
}
