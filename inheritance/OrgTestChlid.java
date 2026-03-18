package inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrgTestChlid extends ParentClass1 {
	
 public static  void main(String [] args) {
	
	 ParentClass1 obj=new ParentClass1();
	
        obj.LauchBrouser();  
        obj.driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
        obj.driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
        obj.driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
        obj.driver.findElement(By.xpath("//input[@name='query_string']")).sendKeys("sunil");
	WebElement webindustry=	obj. driver.findElement(By.xpath("//select[@name='industry']"));
		
		Select dropdoun=new Select(webindustry);
		dropdoun.selectByVisibleText("Education");
		obj.driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
	}
 
}
