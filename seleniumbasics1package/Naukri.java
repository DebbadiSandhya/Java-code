package seleniumbasics1package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
	  d.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI_rfz_tmIiAMV46hmAh1dXDrTEAAYASAAEgKlj_D_BwE&gclsrc=aw.ds");
	  d.manage().window().maximize();
	  WebElement e=d.findElement(By.name("google-register"));
	  e.click();
	  Set<String> s=d.getWindowHandles();
	  System.out.println(s);
	  
	  Iterator<String> i1=s.iterator();
		
		String parentid=i1.next();
		String childid= i1.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		d.switchTo().window(childid);
		Thread.sleep(2000);
		
		WebElement login=d.findElement(By.id("identifierId"));
		login.sendKeys("sandhya.debbadi07@gmail.com");
		Thread.sleep(2000);
		d.switchTo().window(parentid);
		

	}

}
