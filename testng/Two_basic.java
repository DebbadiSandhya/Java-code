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

public class Two_basic {

@BeforeSuite
public void bs() {
	
	System.out.println("1");
	
}
@BeforeTest
public void bt() {
	System.out.println("2");

}
@BeforeClass
public void bc() {
	System.out.println("3");
}
@BeforeMethod
public void bm() {
	System.out.println("4");
}
@Test
	public void test() {
	System.out.println("5");

	}
	
@AfterTest
public void at() {
	System.out.println("6");

}
@AfterMethod
public void am() {
	System.out.println("7");

}
@AfterClass
public void ac() {
	System.out.println("8");

}
@AfterSuite
public void as() {
	System.out.println("9");

}
}
