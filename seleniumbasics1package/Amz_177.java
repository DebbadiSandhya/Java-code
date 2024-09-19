
//177.Search any product and sort them using the newest arrivals criteria.

package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amz_177 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");  
		d.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e=d.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("clothes"+Keys.ENTER);
		WebElement featured=d.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
		featured.click();
		WebElement Newestarrival=d.findElement(By.id("s-result-sort-select_4"));
		Newestarrival.click();
		
	}

}
