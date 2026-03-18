package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingPracticeSenerio2 {
   public static void main(String[] args) {
	   
	   ChromeDriver driver=	new ChromeDriver();
	   driver.manage().window().maximize();
         driver.get("http://localhost:8888/");
         
          driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
         driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
         driver.findElement(By.xpath("//input[@id='submitButton']")).click();
          String HomePage_title=driver.getTitle();
           System.out.println(HomePage_title);
     
     if(HomePage_title.contains("Home")) {
    	 System.out.println("Home Page is displayed ---passed");  
   }else{
	 System.out.println("Home Page is not displayed ---failed");  
   }
   WebElement icon=  driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"));
      Actions act=  new Actions(driver);
       act.moveToElement(icon).build().perform();
       
       driver.findElement(By.xpath("//a[text()='Help']")).click();
       
        Set<String>handle=driver.getWindowHandles();
      for(String handle_All:handle) {
    	  driver.switchTo().window(handle_All);
    	String PageTitle=  driver.getTitle();
    	if(handle_All.equals("vtiger.com|522: Connection timed out")) {
    		System.out.println("help page is open");
    		break;
    	}
      
    	for(String handle_All1:handle) {
    		System.out.println("Current Window Handle value---"+handle_All1);
    		String currenturl=	driver.getCurrentUrl();
      if(handle_All1.equals("Main_Page")) {
      		System.out.println("help page vtiger.com is cureent----passed");
      		driver.close();
      		break;
      	}
      	for(String handle_All2:handle) {
      		System.out.println("All Current Window Handle value---"+handle_All2);
      		driver.switchTo().window(handle_All);
      String currentur=driver.getCurrentUrl();
      if(handle_All2.equals("/index.php")) {
    	  
	  System.out.println("home page Administrator current urlpage is ----passed");
    	  break;
      }
      	
      	}
   
      }
   }
}}