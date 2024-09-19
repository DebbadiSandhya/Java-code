package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoes {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		WebElement search=d.findElement(By.xpath("(//input)[5]"));
		search.sendKeys("shoes"+Keys.ENTER);
		WebElement select=d.findElement(By.xpath("(//div)[216]"));
		select.click();
		
	}

}
