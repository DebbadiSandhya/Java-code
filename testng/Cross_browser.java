package selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browser {
	
	WebDriver d;  //cross browser testing---running the same TC in multiple browsers one by one// 
	@Test
	@Parameters("browser")
	public void Amz(String nameofbrowser) {
		if(nameofbrowser.equals("chrome"))
		{
			d=new ChromeDriver();

		}
		if(nameofbrowser.equals("edge")) {
			d=new EdgeDriver();
		}
		

	 	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	WebElement search=d.findElement(By.xpath("(//input)[5]"));
	search.sendKeys("shoes"+Keys.ENTER);
}
	
}
