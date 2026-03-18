package selenium_prictis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_Handling3 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		
		WebElement weLoginbotton=	driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLoginbotton.click();
         Thread.sleep(5000);

		WebElement wegettext=driver.findElement(By.xpath("//div[@class='errorMessage']"));
		
		String sgetText=wegettext.getText();
		System.out.println("get text massage--"+sgetText);

	if(sgetText.equalsIgnoreCase(sgetText)==true) {
		System.out.println("get text is massage----passed");
	}else{
		System.out.println("get text is not massage----passed");
		
		
	}
	
	}
   
}
