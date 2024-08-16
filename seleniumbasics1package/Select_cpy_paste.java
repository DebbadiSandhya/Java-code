package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_cpy_paste {

	public static void main(String[] args) {

		ChromeDriver c=new ChromeDriver();
        c.get("https://grotechminds.com/registration/");
	c.manage().window().maximize();

        WebElement e=c.findElement(By.name("fname"));
        e.sendKeys("sandy");
        e.sendKeys(Keys.CONTROL+ "a");
        e.sendKeys(Keys.CONTROL+ "c");
        WebElement e1=c.findElement(By.name("lname"));
       
       e1.sendKeys(Keys.CONTROL+ "v");
        
}
}
