package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled_displayed1 {

	public static void main(String[] args) {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement e= d.findElement(By.name("q"));
		boolean b1=e.isDisplayed();
		boolean b2=e.isEnabled();
		System.out.println(b1);
		System.out.println(b2);

		if(e.isDisplayed()&& e.isEnabled()) {
			e.sendKeys("India");
		}
	}

}
