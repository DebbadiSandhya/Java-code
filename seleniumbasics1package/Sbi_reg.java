package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi_reg {

	public static void main(String[] args) {

		ChromeDriver c=new ChromeDriver();
		
		c.get("https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm");
		c.navigate().refresh();
		c.manage().window().maximize();
		
		WebElement account_no=c.findElement(By.id("accountNo"));
		   account_no.sendKeys("352462363266");
		   
		WebElement cifno=c.findElement(By.id("cifNo"));
		   cifno.sendKeys("9485443222");
		
		WebElement branchcode=c.findElement(By.id("branchCode"));
		   branchcode.sendKeys("4985");
		   
		WebElement mobileno=c.findElement(By.id("mobileNo"));
		   mobileno.sendKeys("8787849328");
		   
		
	}

}
