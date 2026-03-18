package selenium_prictis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();


		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();

		WebElement webusername= driver.findElement(By.xpath("//input[@name='user_name']"));
		
		webusername.sendKeys("adminr");
		Thread.sleep(2000);
		webusername.clear();
	
		webusername.sendKeys("admin");
		
		
		if(webusername.isDisplayed()==true) {
			System.out.println("user name text box is  Displaye---passed");
		}else{
			System.out.println("user name text box is not Displaye---failed");

		}
		if(webusername.isEnabled()==true) {
			System.out.println("user name text box is Enabled---passed");
		}else{
			System.out.println("user name text box is not Enabled---failed");

			String stagname=webusername.getTagName();
			System.out.println("getTagname of username field---"+stagname);
		}
		
		String sAttributevalue=webusername.getAttribute("value");
		System.out.println("should be admin----"+sAttributevalue);	

	
		WebElement weuserpassword=	driver.findElement(By.xpath("//input[@name='user_password']"));
		
		weuserpassword.sendKeys("worngpaswprd");
		Thread.sleep(2000);
		weuserpassword.clear();
		weuserpassword.sendKeys("admin");   
          if(weuserpassword.isDisplayed()==true) {
        	  System.out.println("user password field text box is  Displaye---passed");
          }else{
        	  System.out.println("user password field text box is  not Displaye---failed");
          }
          if(weuserpassword.isEnabled()==true) {
        	  
        	  System.out.println("user password field text box is Enabled---passed");
          }else{
        	  System.out.println("user password field text box is not Enable--- failed");
        	  
        	 
       String  webgettagname= weuserpassword.getTagName();
          System.out.println("getTagname of password field---expected input"+webgettagname);  
         
         
         }
          WebElement weLoginbotton=	driver.findElement(By.xpath("//input[@id='submitButton']"));
     	  weLoginbotton.click();
     	  
    WebElement weLeads=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")) ; 
    weLeads.click();
    
    WebElement weleadspone=driver.findElement(By.xpath("//select[@name='viewname']"));
    weleadspone.click();
    
    Select selectobj= new Select(weleadspone);
    
    selectobj.selectByContainsVisibleText("This Month Leads");
    String expecteditem="This Month Leads";
    
    
    
    
    
	}
       


	}
