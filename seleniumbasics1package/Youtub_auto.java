package seleniumbasics1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtub_auto {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver(); 
		d.get("https://www.youtube.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		WebElement s=d.findElement(By.xpath("//input[@id='search']"));
		s.click();
		s.sendKeys("modi");
		Thread.sleep(8000);
		List<WebElement> e=d.findElements(By.xpath("//div[@class='sbsb_a']/ul/li"));
		int count=e.size();
		System.out.println(count);
		 e.get(4).click();
		
	}

}
