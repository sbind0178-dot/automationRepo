package selenium_prictis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiindElements {
	
	public static void main(String []args) {
		test2();
		
	
		ChromeDriver driver =new ChromeDriver();
		
		
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		

		WebElement webname=	driver.findElement(By.xpath("//input[@name='user_name']"));
		webname.sendKeys("admin");

		WebElement webpassword= driver.findElement(By.xpath("//input[@name='user_password']"));
		webpassword.sendKeys("admin");

		WebElement webLogin=	driver.findElement(By.xpath("//input[@id='submitButton']"));
		webLogin.click();
		WebElement weleads=	driver.findElement(By.xpath("//a[text()='Leads']"));
		weleads.click();
			
		
		List<WebElement>wecheck=driver.findElements(By.xpath("//td"));
		
		int totalcount=	wecheck.size();

		for(int i=0; i<totalcount; i++) {		
			WebElement totaltag=wecheck.get(i);

			String inertext=totaltag.getText();

			if(inertext.equalsIgnoreCase("") ==true) {

			}
			else
				System.out.println(i);
			System.out.println(totaltag);
		}
		//	System.out.println(inertext+"----==");
		//	System.out.println(totaltag);
		
		
		
	}	
		public static void test2() {
			ChromeDriver driver =new ChromeDriver();
			driver.get("http://localhost:8888/");
			driver.manage().window().maximize();

			WebElement webname=	driver.findElement(By.xpath("//input[@name='user_name']"));
			webname.sendKeys("admin");

			WebElement webpassword= driver.findElement(By.xpath("//input[@name='user_password']"));
			webpassword.sendKeys("admin");

			WebElement webLogin=	driver.findElement(By.xpath("//input[@id='submitButton']"));
			webLogin.click();
			WebElement weleads=	driver.findElement(By.xpath("//a[text()='Leads']"));
			weleads.click();
				
		driver.findElement(By.xpath("//a[text()='Products']")).click();

		List<WebElement>	webcheck=	driver.findElements(By.xpath("//a"));
		int tocount=	webcheck.size();
		for(int i=0; i<tocount; i++) {
	    WebElement webget=	webcheck.get(i);
	  String innerext1=  webget.getText();

	  if(innerext1.equalsIgnoreCase("")==true) {
		  
	  }else{
		  
		 System.out.println(i); 
		 
		  System.out.println(innerext1); 
	  } 
	  
	   
		
		

	}
		
		}
		}