package java_script_click;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaClick {

	public static void main(String[] args) {
    
		   
		   WebDriver driver=	new ChromeDriver();
		   driver.manage().window().maximize();
	         driver.get("http://localhost:8888/");
	         
	         ///java script click
	     	JavascriptExecutor jse=(JavascriptExecutor)driver;
	     	
	        WebElement userwebname= driver.findElement(By.xpath("//input[@name='user_name']")); 
	         jse.executeScript("arguments[0].value='admin'", userwebname);
	         
	         WebElement webuserpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
	         jse.executeScript("arguments[0].value='admin'", webuserpassword);

	         WebElement clickweb=driver.findElement(By.xpath("//input[@id='submitButton']"));
	         jse.executeScript("arguments[0].click()", clickweb);

	}

}
