package selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvi_Google {

@DataProvider(name="names")
	
	public Object[][] method1()
	{
		return new Object[][]{{"sandhya"},{"Ashwath"},{"Ashwini"}};
	}
@Test(dataProvider="names")
public void testcase1(String input) throws InterruptedException 
{
	WebDriver d=new ChromeDriver();
	d.navigate().to("https://www.google.com/");
	WebElement e=d.findElement(By.name("q"));
	e.sendKeys(input);
	WebElement e1=d.findElement(By.name("btnk"));
	Thread.sleep(2000);
	e1.click();
	
}

}
