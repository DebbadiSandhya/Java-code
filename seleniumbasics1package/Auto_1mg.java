package seleniumbasics1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_1mg {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.1mg.com/labs?utm_source=google&utm_medium=cpc&utm_campaign={Labs-Brands-AllCities-Conversion}&utm_adgroup={adgroup}&utm_keyword=1mg%20app&wpsrc=Google%20AdWords&wpcid=330730704&wpsnetn=g&wpkwn=1mg%20app&wpkmatch=b&wpcrid=677804395579&wpscid=160483731568&wpkwid=kwd-295247122773&gad_source=1&gclid=EAIaIQobChMIg6nwxISGiAMV7aRmAh1nkwhuEAAYASAAEgLONvD_BwE");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.id("search-tests-input"));
	
		Thread.sleep(3000);

		e1.sendKeys("cholesterol");	
		Thread.sleep(3000);
		List<WebElement> e=d.findElements(By.xpath("//div[@id='search-test-dropdown']/div/div"));
		Thread.sleep(3000);
		int count=e.size();
		System.out.println(count);

		e.get(3).click();
	}
//getting lot of pop ups //
}
