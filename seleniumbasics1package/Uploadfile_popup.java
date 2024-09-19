package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Uploadfile_popup {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://grotechminds.com/registration/");
		d.manage().window().maximize();
		WebElement fname=d.findElement(By.id("fname"));
		fname.sendKeys("sandhya");
		WebElement lname=d.findElement(By.id("lname"));
		lname.sendKeys("sandhya");
		WebElement email=d.findElement(By.id("email"));
		email.sendKeys("sandhya.debbadi07@gmail.com");
		WebElement pwd=d.findElement(By.id("password"));
		pwd.sendKeys("sandhya.debbadi07@gmail.com");
		WebElement radio=d.findElement(By.id("Female"));
		radio.click();
		WebElement dropdown=d.findElement(By.id("Skills"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Technical Skills");
		WebElement dropdown2=d.findElement(By.id("Country"));
		Select s2=new Select(dropdown2);
		s2.selectByVisibleText("India");
		WebElement padrss=d.findElement(By.id("Present-Address"));
		padrss.sendKeys("h.no:3422");
		WebElement peradrss=d.findElement(By.id("Permanent-Address"));
		peradrss.sendKeys("h.no:3422 krfrigfr");
		WebElement pincode=d.findElement(By.id("Pincode"));
		pincode.sendKeys("505304");
		WebElement dropdown3=d.findElement(By.id("Relegion"));
		Select s3=new Select(dropdown3);
		s3.selectByValue("Hindu");
		WebElement relocate=d.findElement(By.id("relocate"));
		relocate.click();
		
		WebElement choose_file=d.findElement(By.id("file")); 
		choose_file.sendKeys("C:\\Users\\sandh\\Downloads\\Test.pdf");
		Thread.sleep(2000);

		WebElement submit=d.findElement(By.name("Submit"));
		submit.click();
		
	}
	

}
