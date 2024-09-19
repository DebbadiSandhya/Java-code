package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		WebElement e=d.findElement(By.linkText("Gmail"));
		
		Actions a=new Actions(d);
		a.contextClick(e).perform();//for right click syntax
		
	}

}
