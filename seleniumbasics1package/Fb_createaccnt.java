package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_createaccnt {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement create_account=c.findElement(By.linkText("Create new account"));
		create_account.click();
		Thread.sleep(2000);

		WebElement FN=c.findElement(By.name("firstname"));
		       FN.sendKeys("sadhya");
		
		WebElement LN=c.findElement(By.name("lastname"));
		       LN.sendKeys("debbadi");
		       
		WebElement Mobileno=c.findElement(By.name("reg_email__"));
		       Mobileno.sendKeys("8458584985");
		       
		 WebElement pwd=c.findElement(By.name("reg_passwd__"));       
		       pwd.sendKeys("ewggr@D31e");
	}

}
