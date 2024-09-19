
//201.Write a program to display  multiple test cases together.

package selenium.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Ass_201 {
	
	ChromeDriver d;
	
	@BeforeMethod
	public void Launch() {
		
        d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
	}
		@AfterMethod
		public void quit()
		{
			d.quit();
		}
}
