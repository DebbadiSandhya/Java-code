
//176.Search a product, increase the quantity to 4 and add it to the cart on Amazon

package seleniumbasics1package;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amz_176 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");  
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e=d.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("watches"+Keys.ENTER);
		Thread.sleep(2000);
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
		
		WebElement quantity=d.findElement(By.id("quantity")); //for quantity drop down
		Select s2=new Select(quantity);
		s2.selectByVisibleText("2");
		//s2.selectByIndex(1);
		//s2.selectByValue("2");
		
	}

}
