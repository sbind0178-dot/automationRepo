package selenium_prictis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_field_Properties4 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
	WebElement weusername=	driver.findElement(By.xpath("//input[@name='user_name']"));
		
String sAttributename=	weusername.getAttribute("name");
	System.out.println("user of Attribute name---"+sAttributename);
	
String sgetagname=	weusername.getTagName();
System.out.println("get tagname---"+sgetagname);

	}

}
