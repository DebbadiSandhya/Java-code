package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mkt_html {

	public static void main(String[] args) {

		ChromeDriver d=new ChromeDriver(); 
		d.get("file:///C:/Users/sandh/Downloads/learningHTML1%20(1).html");
		WebElement e=d.findElement(By.name("username"));
		e.sendKeys("sandhya");
		WebElement e1=d.findElement(By.id("2"));
		e1.sendKeys("hello");
		WebElement e2=d.findElement(By.name("password"));
		e2.sendKeys("kjeifd");
		WebElement e3=d.findElement(By.name("fname"));
		e3.sendKeys("debbadi");
		WebElement e4=d.findElement(By.xpath("(//input)[7]"));
		e4.click();
		WebElement e5=d.findElement(By.xpath("(//input)[8]"));
		e5.click();
		WebElement e6=d.findElement(By.xpath("(//input)[9]"));
		e6.click();
		WebElement e7=d.findElement(By.xpath("(//input)[11]"));
		e7.click();
		WebElement e8=d.findElement(By.xpath("(//input)[12]"));
		e8.click();
		WebElement e9=d.findElement(By.xpath("(//input)[13]"));
		e9.click();
		WebElement e10=d.findElement(By.xpath("(//a)[1]"));
		e10.click();
	}

}
