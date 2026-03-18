package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_Handling1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();


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

		WebElement weleadsopen=	driver.findElement(By.xpath("(//select[@name='search_field'])[1]"));	

		Select selobj=  new Select(weleadsopen);

		String expeselectitem="Lead No";
		WebElement we_firstselecte=	selobj.getFirstSelectedOption();
		String actulselect=we_firstselecte.getText();
		System.out.println(actulselect);

		if(actulselect.equalsIgnoreCase(expeselectitem)) {
			System.out.println("actual and seleted matched----passed");

		}else{
			System.out.println("actual and seleted not matched----failed");
			
//		String hv=	driver.getWindowHandle();
//		System.out.println(hv);
		
		}


	}
         
}






