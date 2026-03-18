package selenium_prictis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ations_Navigating5 {

	public static void main(String[] args) {
		

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://localhost:8888/");

		WebElement webusername=	driver.findElement(By.xpath("//input[@name='user_name']"));
		webusername.sendKeys("admin");

		WebElement webpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		webpassword.sendKeys("admin");

		WebElement welogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		welogin.click();
		
	WebElement weMorebptton=	driver.findElement(By.xpath("//a[text()='More']"));
	Actions aobj=new Actions(driver);
	aobj.moveToElement(weMorebptton).build().perform();
	
		
	WebElement weCampaigns=	driver.findElement(By.xpath("//a[@name='Campaigns']"));
	aobj.click();	
		
		driver.navigate().back();
		
		
		
		
		
		
		
		
	}

}
