package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_xpath {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com");

	//	By	byUsername=By.name("identifier");
		By	byUsername=By.xpath("//input[@type='email']");
        WebElement weUsername = driver.findElement(byUsername);
        weUsername.sendKeys("sunil.bind");
        
       By bynext= By.xpath("//span[text()='Next']");
       WebElement wenext=driver.findElement(bynext);
       wenext.click();
	}
}
