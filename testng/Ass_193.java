//193.Write a program where the Class has all the annotations with one extra @ Test annotation

package selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ass_193 {
	
@Test
public void Testcase1() {
	System.out.println("tc1");
}
@Test
public void Testcase2() {
	System.out.println("tc2");
}
@BeforeSuite
public void bs() {
	System.out.println("bs");

}
@BeforeTest
public void bt() {
	System.out.println("bt");

}
@BeforeClass()
public void bc() {
	System.out.println("bc");

}
@BeforeMethod()
public void bm() {
	System.out.println("bm");

}
@AfterSuite
public void as() {
	System.out.println("as");

}
@AfterTest
public void at() {
	System.out.println("at");

}
@AfterClass
public void ac() {
	System.out.println("ac");

}
@AfterMethod
public void am() {
	System.out.println("am");

}
}
