package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_gendor_is_selected {

	public static void main(String[] args) {

		ChromeDriver d=new ChromeDriver(); 
		d.get("file:///C:/Users/sandh/Downloads/learningHTML1%20(1).html");
		WebElement e=d.findElement(By.xpath("(//input)[12]"));
		e.click();
		
		if(e.isSelected()==true) 
		{
			System.out.println("checkbox is selected");
			
		}
		else
			
			System.out.println("checkbox is not selected");
	}

}
