package automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class M_URL {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.get("https://www.amazon.com/");
     
	//	ChromeDriver driver2=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(1000);

		Thread.sleep(100);
	//	driver2.wait(1000);
		driver.close();
	
	
	}
    
}
