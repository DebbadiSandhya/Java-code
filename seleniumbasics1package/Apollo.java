package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apollo {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver(); 
		d.get("https://www.apollopharmacy.in");
		d.manage().window().maximize();
		WebElement s=d.findElement(By.xpath("(//div)[160]"));
	    s.click();
		WebElement search=d.findElement(By.xpath("//input[@id='searchProduct']"));
	    search.sendKeys("Pcm"+Keys.ENTER);
	    Thread.sleep(3000);
	    WebElement select=d.findElement(By.xpath("//h2[1]"));
		select.click();
	}
	

}
