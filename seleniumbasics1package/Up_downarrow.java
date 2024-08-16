package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Up_downarrow {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement type=d.findElement(By.name("q"));
		 type.sendKeys("India");
		 Thread.sleep(4000);
		 type.sendKeys(Keys.ARROW_DOWN);
		 type.sendKeys(Keys.ARROW_DOWN);
		 type.sendKeys(Keys.ENTER);
		 
	}

}
