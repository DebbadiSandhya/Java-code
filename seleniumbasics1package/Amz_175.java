
//175.Login to the Amazon app, search the prod and add the first prod to the wishlist.

package seleniumbasics1package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amz_175 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");  
		d.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e=d.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("watches"+Keys.ENTER);
		Thread.sleep(4000);
		WebElement e1=d.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
		e1.click();
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
		
		WebElement wishlist=d.findElement(By.linkText("Add to Wish List"));
		wishlist.click();

	}

}
