package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHan {
   
	public static void main(String[] args) {
		 

		WebDriver driver = new  ChromeDriver();
		
	    // String stc=driver.getWindowHandle();
	//Set<String> HandaleValue=driver.getWindowHandles();
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Feedback']")).click();
		
		//2
	    // String stc=driver.getWindowHandle(); ////  one  handle value put

		
	///	URL  1... Next Name ---=feedback
				
		Set<String> HandaleValue=driver.getWindowHandles();  /// All handle value put
		for(String handle:HandaleValue){			
			driver.switchTo().window(handle);
		String windowurl=	driver.getCurrentUrl();
		if(windowurl.contains("feedback")) {
			//System.out.println("found");
			break;
		}
		System.out.println(handle);
		}
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("service is good");
		driver.close();   ///   feedback it is  will be  closed 
		
		
	///    2... URL Next name = index.php
	/// 
		HandaleValue=driver.getWindowHandles();  /// All handle value put
		for(String handle:HandaleValue){
			driver.switchTo().window(handle);
		String windowurl=	driver.getCurrentUrl();
		if(windowurl.contains("index.php")) {     //URL se maich name index.php give me
			System.out.println("found");
			break;
		}
		System.out.println(handle);
		 

		}
	
	}
}
