package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amz_login {

	public static void main(String[] args) {

		ChromeDriver c=new ChromeDriver();
		c.get("https://www.amazon.in");
        WebElement un=c.findElement(By.name("email"));
            un.sendKeys("sandhya.debbadi07@gmail.com");
        WebElement cont=c.findElement(By.id("continue"));
            cont.click();
        WebElement pwd=c.findElement(By.name("password"));
            pwd.sendKeys("Sandy@143");
        WebElement signin=c.findElement(By.id("signInSubmit"));
            signin.click();
            
        
		
	}

}
