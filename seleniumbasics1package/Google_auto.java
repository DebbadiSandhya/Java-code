package seleniumbasics1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_auto {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e=d.findElement(By.name("q"));
		e.sendKeys("modi");
		Thread.sleep(2000);
		e.click();
		List<WebElement> e1=d.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=e1.size();
		System.out.println(count);
		Thread.sleep(2000);
		e1.get(3).click();
		//e1.get(count-10).click();
	}

}
