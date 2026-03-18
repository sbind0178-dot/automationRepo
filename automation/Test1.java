 package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
   ChromeDriver driver =  new ChromeDriver();
   driver.get("https://www.flipkart.com/");
   
 WebElement webflipcart=  driver.findElement(By.xpath("//a[@aria-label='Mobiles & Tablets']"));
   
 // Thread.sleep(2000) ;

  webflipcart.click();
  Thread.sleep(1000);
  driver.close();
  
   
   //  Thread.sleep(2000);
//    driver.close();
//   
	}

}
