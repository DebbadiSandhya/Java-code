package seleniumbasics1package;

import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {
	static int validlinkcount=0;
	static int brokenlinkcount=0;
	static int handledlinkcount=0;
	

	public static void main(String[] args) throws InterruptedException, IOException  {


			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().minimize();
			driver.get("https://www.amazon.com");
			Thread.sleep(3000);
			List<WebElement> l1=driver.findElements(By.tagName("a"));
			int count=l1.size();
			System.out.println(count);
			for(int i=0;i<count;i++)
			{
				WebElement e1=l1.get(i);
				String url=e1.getAttribute("href");
				System.out.println(url);
				verify_each_links(url);
				
			}
			System.out.println("Valid Links: " + validlinkcount);
	        System.out.println("Broken Links: " + brokenlinkcount);
	        System.out.println("Handled Links: " + handledlinkcount);
	     	
		}
		static void verify_each_links(String url) throws IOException
		{
	try {	
			URL u1=new URL(url);
			HttpURLConnection h1=(HttpURLConnection) u1.openConnection();
			int b1=h1.getResponseCode();
			if(b1==200)
			{
				System.out.println("It is a valid links " + h1.getResponseCode()+ "  " +h1.getResponseMessage());
				validlinkcount++;
			}
			else
			{
				System.out.println("It is a broken links"+  h1.getResponseCode() + "  "+ h1.getResponseMessage());
				brokenlinkcount++;
			}
		}
	catch(MalformedURLException a1)
	{
		System.out.println("It is a broken links-Handled");
		handledlinkcount++;
	}	
		}
	}

