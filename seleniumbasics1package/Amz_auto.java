package seleniumbasics1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amz_auto {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.id("twotabsearchtextbox"));
			e1.sendKeys("shoes");	
			Thread.sleep(2000);
		List<WebElement> e=d.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=e.size();
		System.out.println(count);
		e.get(count-7).click();
		
	}

}
