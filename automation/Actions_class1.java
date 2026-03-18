package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://localhost:8888/");

		WebElement webusername=	driver.findElement(By.xpath("//input[@name='user_name']"));
		webusername.sendKeys("admin");

		WebElement webpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		webpassword.sendKeys("admin");

		WebElement welogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		welogin.click();

		Actions actobj=new Actions(driver);

		// mouse hover	
		WebElement webleads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		actobj.moveToElement(webleads).build().perform();
	//	actobj.contextClick(webleads).build().perform();
	//actobj.doubleClick(webleads).build().perform();       
	//	driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement web_Organizations=driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
		actobj.moveToElement(web_Organizations).build().perform();
	
		actobj.contextClick(web_Organizations).build().perform();
      //  driver.navigate().back();
        Thread.sleep(2000);
        
		WebElement web_Contacts	=  driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']"));
  	actobj.moveToElement(web_Contacts).build().perform();
	
  	Thread.sleep(2000);
  	
		WebElement we_Email=  driver.findElement(By.xpath("//a[@href='index.php?module=Emails&action=index']"));   
		actobj.moveToElement(we_Email).build().perform();
		Thread.sleep(2000);
		
		//// Right click////////	

		WebElement weplusbutton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
	  actobj.moveToElement(weplusbutton).build().perform();
		actobj.contextClick(weplusbutton).build().perform();
		Thread.sleep(2000);
		
		WebElement wemore= driver.findElement(By.xpath("//a[text()='More']"));
		actobj.moveToElement(wemore).build().perform();
		
		
		
	}

}
