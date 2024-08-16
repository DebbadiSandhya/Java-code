package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_gmail {

	public static void main(String[] args) {

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.findElement(By.linkText("Gmail")).click();
	}

}
