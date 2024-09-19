package seleniumbasics1package;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_fb {

	public static void main(String[] args) {

		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com");
		c.manage().window().maximize();

		c.findElement(By.xpath("//input[@id='email']")).sendKeys("9908699473");
		c.findElement(By.xpath("//input[@name='pass']")).sendKeys("Sandy@143");
		c.findElement(By.xpath("//button[@name='login']")).click();
		
		
		/*c.findElement(By.name("email")).sendKeys("9908699473");
		c.findElement(By.name("pass")).sendKeys("Sandy@143");
		c.findElement(By.name("login")).click();*/
	}

}
