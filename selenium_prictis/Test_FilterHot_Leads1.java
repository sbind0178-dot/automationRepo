package selenium_prictis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_FilterHot_Leads1 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();

		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();

		WebElement webusername=	driver.findElement(By.xpath("//input[@name='user_name']"));
		webusername.sendKeys("admin");

		WebElement webpassword=	driver.findElement(By.xpath("//input[@name='user_password']"));
		webpassword.sendKeys("admin");

		WebElement weLoginbotton=	driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLoginbotton.click();

		WebElement weLeadsbotton=  driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		weLeadsbotton.click();

	WebElement wefilter=	driver.findElement(By.xpath("//select[@name='viewname']"));
	wefilter.click();
		
		Select sfilter=new  Select (wefilter);
		sfilter.selectByContainsVisibleText("Hot Leads");
		String expecteditem="Hot Leads";
	}

}
