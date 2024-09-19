
//187.Count the Valid, broken and handled links on the amazon page
package seleniumbasics1package;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amz_187 {

	static int count=0;
	static int count1=0;
	static int handledlinkcount=0;
	public static void main(String[] args) throws IOException {

		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().minimize();
		List<WebElement> l1=	driver.findElements(By.tagName("a"));
		int count=	l1.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement e1=	l1.get(i);
			String url=	 e1.getAttribute("href");
			System.out.println(url );
			verify_each_links(url);
		}
		System.out.println("Valid Links: " +count++);
        System.out.println("Broken Links: " +count1++);
        System.out.println("Handled Links: " +handledlinkcount++);
	}
	
	static void verify_each_links(String url) throws IOException
	{
		try
		{
		URL u1= new URL(url);
		HttpURLConnection h1 =(HttpURLConnection) u1.openConnection();
	
		int b1=h1.getResponseCode();
			
		if(b1==200)
			
		{
			
			System.out.println("It is a valid link "    +h1.getResponseCode() +" " +h1.getResponseMessage());
			//System.out.println(count);
			count++;
		}
	
		else {
			
			//System.out.println(count1++);
			System.out.println("It is  a broken link "  +h1.getResponseCode() +" " +h1.getResponseMessage());
			count1++;
	}
}
	catch(MalformedURLException a1)
	{
		System.out.println("It is a broken links-Handled");
		handledlinkcount++;
		//System.out.println(handledlinkcount++);

		
	}
}
	
}

