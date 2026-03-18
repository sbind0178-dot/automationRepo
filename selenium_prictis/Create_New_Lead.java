package selenium_prictis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_New_Lead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();

		WebElement webusername= driver.findElement(By.xpath("//input[@name='user_name']"));
		webusername.sendKeys("admin");

		WebElement webuserpassword= driver.findElement(By.xpath("//input[@name='user_password']"));
		webuserpassword.sendKeys("admin");

		WebElement webloginboutton=  driver.findElement(By.xpath("//input[@type='submit']"));
		webloginboutton.click();

		WebElement webleads=   driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		webleads.click();

		driver.navigate().back();

		WebElement webleads2=   driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		webleads2.click();

		WebElement weplush=	driver.findElement(By.xpath("//img[@title='Create Lead...']"));
		weplush.click();


		WebElement weFirstname=	driver.findElement(By.xpath("//input[@name='firstname']"));
		weFirstname.sendKeys("sunil");

		WebElement weLastname=		driver.findElement(By.xpath("//input[@name='lastname']"));
		weLastname.sendKeys("bind");
		
	WebElement weCompany=	driver.findElement(By.xpath("//input[@name='company']"));
     weCompany.sendKeys("TCS");
  WebElement weLead_source =  driver.findElement(By.xpath("//select[@name='leadsource']"));  
     
     Select sobj=new Select(weLead_source);
     sobj.selectByIndex(4);
     
    WebElement weEmail= driver.findElement(By.xpath("//input[@id='secondaryemail']"));
    weEmail.sendKeys("sbinf02343gmail@.com");
    
   WebElement wephone= driver.findElement(By.xpath("//input[@id='phone']"));
    wephone.sendKeys("0994184823");
    
   WebElement wecity= driver.findElement(By.xpath("//input[@id='city']"));
	
	wecity.sendKeys("sant ravidas nagar (bhadohi)");
	
WebElement wedescription=	driver.findElement(By.xpath("//textarea[@name='description']"));
	wedescription.sendKeys("text area");
	
WebElement wesave=	driver.findElement(By.xpath("//input[@class='crmButton small save']"));
	wesave.click();
	
	
	}

}
