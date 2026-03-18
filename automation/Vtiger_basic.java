package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_basic {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver driver=new ChromeDriver();
        
        driver.get("http://localhost:8888");

        
        WebElement  Webusername =driver.findElement(By.name("user_name"));
        Webusername.sendKeys("admin");
        WebElement  webpassword = driver.findElement(By.name("user_password"));
        webpassword.sendKeys("admin");
        WebElement webutton= driver.findElement(By.id("submitButton"));
        webutton.click();
        
  //      Thread.sleep(1000);
  //     WebElement wename= driver.findElement(By.name("firstname"));
 //      wename.sendKeys("sunil");
   //     driver.close();

      
        
        WebElement Calendarbutton=driver.findElement(By.xpath("//a[@href='index.php?module=Calendar&action=index']"));
        Calendarbutton.click();
        
        WebElement Leadsboutton= driver.findElement(By.linkText("Leads"));
        Leadsboutton.click();
        
        WebElement   Organizationsbutton= driver.findElement(By.linkText("Organizations"));
        Organizationsbutton.click();
        
        WebElement Contactsboutton=driver.findElement(By.linkText("Contacts"));
        Contactsboutton.click();
        
        WebElement home= driver.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']"));
        home.click();
        Thread.sleep(2000);
        
        WebElement Opportunitiesboutton= driver.findElement(By.linkText("Opportunities"));
        Opportunitiesboutton.click();
        
        WebElement Productsboutton=driver.findElement(By.linkText("Products"));
        Productsboutton.click();
        
        WebElement Documentsboutton= driver.findElement(By.linkText("Documents"));
        Documentsboutton.click();
        
        WebElement Emailboutton=driver.findElement(By.linkText("Email"));
        Emailboutton.click();
        
        Thread.sleep(2000);
        WebElement home1= driver.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']"));
        home1.click();
        Thread.sleep(2000);
        
        WebElement Trouble_Ticketsboutton  = driver.findElement(By.linkText("Trouble Tickets"));
        Trouble_Ticketsboutton.click();
        
        WebElement Dashboardboutton= driver.findElement(By.linkText("Dashboard"));
        Dashboardboutton.click();
	}

}
