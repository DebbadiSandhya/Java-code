
//179.On the flipkart website, search for shoes and then click on the first item and add the first item to the cart.
package seleniumbasics1package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_179 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		WebElement e=d.findElement(By.name("q"));
		e.sendKeys("shoes"+Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement item=d.findElement(By.xpath("//div[@class='cPHDOP col-12-12']/div/div[2]"));
		item.click();
		
		Thread.sleep(2000);
		Set<String> s1=d.getWindowHandles();//1st will get parent id then any of the child id 
		System.out.println(s1);
		
		Iterator<String> i1=s1.iterator();
		
		String parentid=i1.next();
		String childid= i1.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		d.switchTo().window(childid);
		Thread.sleep(2000);

		WebElement addtocart=d.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		addtocart.click();
		
		
	}

}
