package inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  ParentClass1 {

     	ChromeDriver driver;

	public void LauchBrouser() {
		
		driver=new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		WebElement webusername= driver.findElement(By.xpath("//input[@name='user_name']"));
		webusername.sendKeys("admin");
		WebElement webuserpassword= driver.findElement(By.xpath("//input[@name='user_password']"));
		webuserpassword.sendKeys("admin");
		WebElement webloginboutton=  driver.findElement(By.xpath("//input[@type='submit']"));
		webloginboutton.click();

		
		
	
}

}
