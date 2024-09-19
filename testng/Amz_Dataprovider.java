package selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amz_Dataprovider{
	
	@Test(dataProvider="login details")
	
public void login(String un, String pwd) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	WebElement e=d.findElement(By.id("nav-link-accountList"));
	Actions a1=new Actions(d);
	a1.moveToElement(e).perform();
	e.click();
	Thread.sleep(2000);
	d.findElement(By.name("email")).sendKeys(un);
WebElement cont=d.findElement(By.id("continue"));
    cont.click();
    Thread.sleep(2000);
d.findElement(By.name("password")).sendKeys(pwd);
WebElement signin=d.findElement(By.id("signInSubmit"));
    signin.click();
	
}
@DataProvider(name="login details")
public Object[][] methods1()
{
	Object[][] data=new Object[3][2];
	//set 1
data[0][0]="9908699473";
data[0][1]="Sandy@143";
//set 2
data[1][0]="sandhya.debbadi@gmail.com";
data[1][1]="Sandy@143";
//set 3
data[2][0]="9059345332";
data[2][1]="Sandy@143";

return data;
}
}