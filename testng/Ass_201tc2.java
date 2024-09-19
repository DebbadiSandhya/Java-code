package selenium.testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass_201tc2 extends Ass_201 {

	@BeforeMethod
	public void addtocart() throws InterruptedException {
	WebElement e=d.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(d);
		a1.moveToElement(e).perform();
		e.click();
		Thread.sleep(2000);
	WebElement un=d.findElement(By.name("email"));
	    un.sendKeys("9908699473");
	WebElement cont=d.findElement(By.id("continue"));
	    cont.click();
	    Thread.sleep(2000);
	WebElement pwd=d.findElement(By.name("password"));
	    pwd.sendKeys("Sandy@143");
	WebElement signin=d.findElement(By.id("signInSubmit"));
	    signin.click();
	    Thread.sleep(2000);
	}
	
	@Test
	public void search_cart() throws InterruptedException {
		
	WebElement e1=d.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a2=new Actions(d);
		a2.moveToElement(e1).perform();
	WebElement e2=d.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys("Shoes"+Keys.ENTER);
		Thread.sleep(2000);
	WebElement e3=d.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
		e3.click();
		Set<String> s1=d.getWindowHandles();//1st will get parent id then any of the child id 
		System.out.println(s1);
	
		Iterator<String> i1=s1.iterator();
		
		String parentid=i1.next();
		String childid= i1.next();
		
		d.switchTo().window(childid);
		Thread.sleep(2000);
		
	WebElement cart=d.findElement(By.id("add-to-cart-button"));
		cart.click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logouttc2() {
		
	WebElement e1=d.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a2=new Actions(d);
		a2.moveToElement(e1).perform();
	WebElement logout=d.findElement(By.id("nav-item-signout"));
		logout.click();
	}
}
