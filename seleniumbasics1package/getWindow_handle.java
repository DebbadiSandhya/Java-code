package seleniumbasics1package;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class getWindow_handle {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.close();
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getTitle());
			TakesScreenshot t1=	driver;
			
			/*File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\sandh\\eclipse-workspace\\seleniumbasics1\\src\\Screenshots\\ram"+ new getWindow_handle().getClass()   +".png");
		FileHandler.copy(source, destination);*///for SS using get class//
	
			/*File source=t1.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\sandh\\eclipse-workspace\\seleniumbasics1\\src\\Screenshots\\ram"+ Math.random()   +".png");
			FileHandler.copy(source, destination);*/ //for SS using math/random//
			
		  /*  File source=t1.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\sandh\\eclipse-workspace\\seleniumbasics1\\src\\Screenshots\\ram.png");
			FileHandler.copy(source, destination); */  //for normal SS 
			
			 File source=t1.getScreenshotAs(OutputType.FILE);
				File destination=new File("C:\\Users\\sandh\\eclipse-workspace\\seleniumbasics1\\src\\Screenshots\\ram.png");
				FileHandler.copy(source, destination);
			
	}

}
