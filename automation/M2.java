package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class M2 {

		public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=  new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
          
		driver.get("https://www.meesho.com/");
	    Thread.sleep(10000);
	    driver.close();
	//    RemoteWebElement ad.findElement(By.xpath("https://www.meesho.com/"));
	    
		ChromeDriver driver1=new ChromeDriver();

	    driver1.get("https://sarkariresult.com.cm/");
        driver1.get("https://instagram.com");
		driver1.get("https://www.facebook.com");
		driver1.get("https://mail.google.com");

		ChromeDriver driver2=new ChromeDriver();

		driver2.get("https://www.WhatsApp.com/");

        driver2.get("https://play.google.com/");
	    Thread.sleep(10000);
	    driver2.close();

	}

		
		}
		

