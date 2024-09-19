package seleniumbasics1package;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		 
			{
				
				ChromeDriver d=new ChromeDriver();
				//d.get("https://www.google.com/");// for google page both the programs includes
				d.get("https://www.amazon.in/");  
				d.manage().window().maximize();
				Thread.sleep(2000);
				
				TakesScreenshot t1=	d;
				
				File source=t1.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\sandh\\eclipse-workspace\\seleniumbasics1\\src\\Screenshots\\ram.png");
			FileHandler.copy(source, destination);

	}


}	
	
}