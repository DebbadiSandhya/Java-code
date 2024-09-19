package seleniumbasics1package;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Implicitwait {
@Test
public void Wait() {
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");  
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait syntax
	WebElement e=d.findElement(By.id("twotabsearchtextbox"));
	e.sendKeys("Shoes"+Keys.ENTER);
	WebElement e1=d.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
	e1.click();
	Set<String> s1=d.getWindowHandles();//1st will get parent id then any of the child id 
	System.out.println(s1);

	Iterator<String> i1=s1.iterator();
	
	String parentid=i1.next();
	String childid= i1.next();
	
	d.switchTo().window(childid);
	
	WebElement cart=d.findElement(By.id("add-to-cart-button"));
	cart.click();
}


}
