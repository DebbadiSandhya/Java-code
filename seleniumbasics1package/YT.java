package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YT {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver(); 
		d.get("https://www.youtube.com/");
		WebElement s=d.findElement(By.xpath("//input[@id='search']"));
		Thread.sleep(5000);
		s.sendKeys("grotechminds");
		Thread.sleep(3000);
		s.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement s1=d.findElement(By.partialLinkText("Subscribe"));
		Thread.sleep(2000);
		s1.sendKeys(Keys.ENTER);
		
		
		
	}

}
