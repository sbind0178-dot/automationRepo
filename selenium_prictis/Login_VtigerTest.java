package selenium_prictis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_VtigerTest {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();

		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
/// 
////////////////////////////////////////Scenario.1///////////////////////////////////
///
		WebElement weusername=	   driver.findElement(By.xpath("//input[@name='user_name']"));
		weusername.sendKeys("admin");

		WebElement webpassword=	driver.findElement(By.xpath("//input[@name='user_password']"));
		webpassword.sendKeys("admin");

		WebElement weLoginbotton=	driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLoginbotton.click();

		//WebElement weTitle=	driver.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']"));

		String sgettile=	driver.getTitle();
		System.out.println("get Title----"+sgettile);
		
		
///////////////////////////////////////////Scenario.2/////////////////////////////////////////


		WebElement webSearchBox=	driver.findElement(By.xpath("//input[@name='query_string']"));

		webSearchBox.sendKeys("Test Lead");
		Thread.sleep(1000);
		webSearchBox.clear();

		WebElement weLeads=	driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		weLeads.click();

		WebElement weDropdown=	driver.findElement(By.xpath("//select[@name='search_field']"));

		Select obselect=new Select(weDropdown);

		obselect.selectByVisibleText("Last Name");
		Thread.sleep(1000);
		obselect.selectByIndex(3);

		String getcurrenturl=	driver.getCurrentUrl();
		System.out.println("get Current URL----"+getcurrenturl);
		
		}
	
		/////////////////////////////////////////////Scenario.3///////////////////////////////////////
		
		public static void Scenaio3() {
			
			ChromeDriver driver= new ChromeDriver();
			driver.get("http://localhost:8888/");
			
			WebElement weusername=	   driver.findElement(By.xpath("//input[@name='user_name']"));
			weusername.sendKeys("");

			WebElement webpassword=	driver.findElement(By.xpath("//input[@name='user_password']"));
			webpassword.sendKeys("");

			WebElement weLoginbotton=	driver.findElement(By.xpath("//input[@id='submitButton']"));
		//	weLoginbotton.click();
		
		





		

	}

}
