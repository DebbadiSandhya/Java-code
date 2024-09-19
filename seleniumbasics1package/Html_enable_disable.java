package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_enable_disable {

	public static void main(String[] args) {

		ChromeDriver d=new ChromeDriver(); 
		d.get("file:///C:/Users/sandh/Downloads/learningHTML1%20(1).html");
		WebElement e=d.findElement(By.id("121"));
		boolean b1=e.isDisplayed();
		boolean b2=e.isEnabled();
		System.out.println(b1);
		System.out.println(b2);

		if(e.isDisplayed()&& e.isEnabled()) {
			e.sendKeys("debbadi");
		}
		else
		
			System.out.println("sorry");
		
	}

}
