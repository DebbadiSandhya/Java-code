
//173.After adding products to the cart, automate to reach till the payment page

package seleniumbasics1package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amz_173_pay {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");  
		d.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e=d.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("Shoes"+Keys.ENTER);
		Thread.sleep(2000);
		WebElement e1=d.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
		e1.click();
		Set<String> s1=d.getWindowHandles();//1st will get parent id then any of the child id 
		System.out.println(s1);
		
		Iterator<String> i1=s1.iterator();
		
		String parentid=i1.next();
		String childid= i1.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		d.switchTo().window(childid);
		Thread.sleep(2000);
		
		WebElement cart=d.findElement(By.id("add-to-cart-button"));
		cart.click();
		WebElement proceed=d.findElement(By.name("proceedToRetailCheckout"));
		proceed.click();
		
		Thread.sleep(2000);
		WebElement email=d.findElement(By.name("email"));
		email.sendKeys("sandhya.debbadi07@gmail.com");
		
		WebElement cont=d.findElement(By.id("continue"));
        cont.click();
		Thread.sleep(2000);
    WebElement pwd=d.findElement(By.name("password"));
        pwd.sendKeys("Sandy@143");
    WebElement signin=d.findElement(By.id("signInSubmit"));
        signin.click();
        
	}

}
