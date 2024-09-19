package seleniumbasics1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_auto {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.myntra.com/");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		e1.sendKeys("kurties");	
		Thread.sleep(2000);
		List<WebElement> e=d.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']/ul/li"));
		//int count=e.size();
		//System.out.println(count);
		e.get(3).click();
		
	}

}
