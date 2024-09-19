package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotech_dropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://grotechminds.com/dropdown/");  
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e1=d.findElement(By.id("Choice1"));
		Select s1=new Select(e1);
	    s1.selectByVisibleText("Demo2");
	    
		
	}

}
