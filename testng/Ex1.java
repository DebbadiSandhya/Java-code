package selenium.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex1 {
 @Test
 public void search() {
	 System.out.println("searching");
 }
@BeforeMethod
public void browserlaunch() {
	 System.out.println("browser launch");

}
@AfterMethod
public void quit() {
	 System.out.println("browser quit");

}
	
}
