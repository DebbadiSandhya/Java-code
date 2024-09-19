package selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_2TC {

	WebDriver d;
	@Test
	@Parameters("browser")
	public void TC1(String nameofbrowser) {
		
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


@Test
@Parameters("browser1")
public void TC2(String nameofbrowser1) {
	
	if(nameofbrowser1.equals("chrome"))
	{
		d=new ChromeDriver();

	}
	if(nameofbrowser1.equals("edge")) {
		d=new EdgeDriver();
	}
	
	d.get("https://www.amazon.in");
	d.manage().window().maximize();
	WebElement e1=d.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("mobiles"+Keys.ENTER);
}
}
