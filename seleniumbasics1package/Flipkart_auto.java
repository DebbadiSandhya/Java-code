package seleniumbasics1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_auto {

	public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			WebElement e1=driver.findElement(By.name("q"));
			e1.sendKeys("shoes");
			Thread.sleep(5000);
	List<WebElement> e=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
	Thread.sleep(2000);
	int count=e.size();
	System.out.println(count);
	e.get(count-5).click();
			
		}

	
	}


