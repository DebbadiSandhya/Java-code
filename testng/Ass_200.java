
//200.WAP to show timeOut parameter

package selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ass_200 {

	@Test(timeOut=300000)
	public void Amz_login() throws InterruptedException {
		
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		WebElement e=d.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(d);
		a1.moveToElement(e).perform();
		e.click();
		Thread.sleep(2000);
		WebElement un=d.findElement(By.name("email"));
        un.sendKeys("9908699473");
    WebElement cont=d.findElement(By.id("continue"));
        cont.click();
        Thread.sleep(2000);
    WebElement pwd=d.findElement(By.name("password"));
        pwd.sendKeys("Sandy@143");
    WebElement signin=d.findElement(By.id("signInSubmit"));
        signin.click();
		
		
	}
}
