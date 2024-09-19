package selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass_201tc1 extends Ass_201{

	@BeforeMethod
public void Amz_Login() throws InterruptedException {
	
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
    Thread.sleep(2000);
	}
	
    @Test
    public void Search() {
  WebElement search=d.findElement(By.xpath("(//input)[5]"));
	search.sendKeys("shoes"+Keys.ENTER);
	
    }
    
    @AfterMethod
    public void logout() {
    	
  WebElement e1=d.findElement(By.id("nav-link-accountList-nav-line-1"));
    	Actions a2=new Actions(d);
    	a2.moveToElement(e1).perform();
 WebElement logout=d.findElement(By.id("nav-item-signout"));
		logout.click();
}	
}
