package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amz_customer {

	public static void main(String[] args) {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		//WebElement cust=d.findElement(By.linkText("Customer Service"));
	           // cust.click();
	    WebElement cust1=d.findElement(By.partialLinkText("Customer Se"));
                cust1.click();

	}
	

}
