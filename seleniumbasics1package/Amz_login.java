package seleniumbasics1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amz_login {

	public static void main(String[] args) {

		ChromeDriver c=new ChromeDriver();
		c.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9183099%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D6330229604140696533%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        WebElement un=c.findElement(By.name("email"));
            un.sendKeys("sandhya.debbadi07@gmail.com");
        WebElement cont=c.findElement(By.id("continue"));
            cont.click();
        WebElement pwd=c.findElement(By.name("password"));
            pwd.sendKeys("Sandy@143");
        WebElement signin=c.findElement(By.id("signInSubmit"));
            signin.click();
            
        
		
	}

}
