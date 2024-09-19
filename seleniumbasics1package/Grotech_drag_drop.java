package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotech_drag_drop {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.get("https://grotechminds.com/drag-and-drop/");
		d.manage().window().maximize();
		WebElement drag=d.findElement(By.xpath("//div[@id='container-6']"));
		WebElement drop=d.findElement(By.id("div2"));
		Thread.sleep(2000);
		 Actions a1=new Actions(d);
		 a1.dragAndDrop(drag, drop).perform();
	}

}
