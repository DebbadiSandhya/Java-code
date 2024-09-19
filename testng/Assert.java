package selenium.testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assert {
	
@Test
public void Amz_login() throws InterruptedException, EncryptedDocumentException, IOException {
	
	FileInputStream f1=new FileInputStream("C:\\Users\\sandh\\eclipse-workspace\\seleniumbasics1\\DDT\\Sandhya.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	String username=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	String password=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
                                   //another easy way to fetch the data from the excel sheet//
	//System.out.println(username);
  // System.out.println(password);
ChromeDriver d=new ChromeDriver();
d.get("https://www.amazon.in/");
d.manage().window().maximize();
WebElement e=d.findElement(By.id("nav-link-accountList"));
Actions a1=new Actions(d);
a1.moveToElement(e).perform();
e.click();
Thread.sleep(2000);
WebElement un=d.findElement(By.name("email"));
un.sendKeys(username);
WebElement cont=d.findElement(By.id("continue"));
cont.click();
Thread.sleep(2000);
WebElement pwd=d.findElement(By.name("password"));
pwd.sendKeys(password);
WebElement signin=d.findElement(By.id("signInSubmit"));
signin.click();

//Assert.assertEquals(d.getTitle(),"Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available");

WebElement e1=d.findElement(By.id("twotabsearchtextbox"));

//private static void assertEquals(boolean displayed, boolean b, String string) {
 //Assert.assertEquals(e1.isDisplayed(), true,"Sorry");
}


	
}

	






