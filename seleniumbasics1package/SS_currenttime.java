package seleniumbasics1package;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS_currenttime {

	public static void main(String[] args) throws InterruptedException, IOException{

		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		Date d1=new Date();
		System.out.println(d1.getTime());
		//epoch time
		Date d2=new Date(d1.getTime());
		
		System.out.println("Current Time->"+d1);
		String time=d1.toString().replace(":", "").replace(" ", "")+".png";
		System.out.println(time);
		
		TakesScreenshot t1=driver;
		File f1=t1.getScreenshotAs(OutputType.FILE);
	File f2=new File("C:\\Users\\sandh\\eclipse-workspace\\seleniumbasics1\\src\\Screenshots\\ram.png"+time);
		FileHandler.copy(f1,f2);
	}

}
