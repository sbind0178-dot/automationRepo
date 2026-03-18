package selenium_prictis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Dropdown {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
   driver.get("http://localhost:8888/");
   driver.manage().window().maximize();
   
  WebElement weusername= driver.findElement(By.xpath("//input[@name='user_name']"));
  weusername.sendKeys("admin");
  WebElement webuserpassword= driver.findElement(By.xpath("//input[@name='user_name]"));
   webuserpassword.sendKeys("admin");
   
       driver.findElement(By.xpath(""));
	}

}
