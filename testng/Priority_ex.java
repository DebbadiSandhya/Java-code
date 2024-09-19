package selenium.testng;

import org.testng.annotations.Test;

public class Priority_ex {//before priority it will execute in alphabetical manner//196.Assinmnt

	@Test(priority=-1)  //after giving priority lower priority will execute first
	public void login() {
		System.out.println("logged in");
	}
	@Test(priority=1)
	public void register() {
		System.out.println("registered");
	}
	@Test(priority=2)
	public void logout() {
		System.out.println("logout");
	}
	
}
