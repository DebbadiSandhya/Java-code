package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_login {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver e=new ChromeDriver();
		e.get("https://www.flipkart.com/account/login?ret=/");
		
		WebElement un=e.findElement(By.xpath("(//input)[7]"));
		un.sendKeys("9908699473");
		Thread.sleep(2000);
		WebElement otp=e.findElement(By.xpath("(//button)[2]"));
		otp.click();
		//WebElement otp1=e.findElement(By.xpath("(//input)[8]"));
		//otp1.sendKeys("125566");
		WebElement verify=e.findElement(By.xpath("(//input)[2]"));
		verify.click();

	}

}
