package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MyAction_class2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();


		driver.get("http://localhost:8888/");

		WebElement webusername= driver.findElement(By.xpath("//input[@name='user_name']"));
		webusername.sendKeys("admin");
		WebElement webuserpassword= driver.findElement(By.xpath("//input[@name='user_password']"));
		webuserpassword.sendKeys("admin");
		WebElement webloginboutton=  driver.findElement(By.xpath("//input[@type='submit']"));
		webloginboutton.click();
		
		WebElement webleads=   driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		Actions act=new Actions(driver);
		act.doubleClick(webleads).build().perform();

		
		
		
	}

}
