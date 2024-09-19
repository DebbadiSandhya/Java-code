package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart_hoverover_assinmnt {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.xpath("//span[.='Home & Furniture'][1]"));
		Thread.sleep(2000);
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2=	driver.findElement(By.linkText("Home Decor"));
		a1.moveToElement(e2).perform();
		Thread.sleep(2000);
		WebElement e3=	driver.findElement(By.linkText("Clocks"));
		e3.click();
	}

}
