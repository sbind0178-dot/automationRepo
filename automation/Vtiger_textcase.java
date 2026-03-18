package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_textcase {

	public static void main(String[] args) {
     
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8888/");
      // vtiger is textcase consol in
		
		By byusername =By.name("user_name");   
		WebElement webusername= driver.findElement(byusername);
		String Aname=  webusername.getAttribute("name");
		System.out.println("valid user name --- "+Aname);

		By userpass=By.name("user_password");
		WebElement webuserpass= driver.findElement(userpass);
		String userpassword=webuserpass.getAttribute("name");
		System.out.println("valid user  pasword ---  "+" "+userpassword);
		
		By userbutton=By.xpath("//input[@id='submitButton']");
		WebElement webbutton=driver.findElement(userbutton);
		String userlogin=webbutton.getAttribute("value");
		System.out.println(" valid user  ki boutton --- "+userlogin);



	
	}

}
