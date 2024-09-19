package selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Retry_failed {

@Test(retryAnalyzer=selenium.testng.Retry_Analyzer.class) //pkgname.classname
public void method1() throws InterruptedException {
	
	WebDriver d=new ChromeDriver();
	d.navigate().to("https://www.google.com/");
	WebElement e=d.findElement(By.name("qu"));
	e.sendKeys("india");
	WebElement e1=d.findElement(By.name("qu"));
	Thread.sleep(2000);
	e1.sendKeys(Keys.ENTER);
	
}
	
}
