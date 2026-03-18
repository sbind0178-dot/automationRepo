package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class HandlingPracticeSenerio1 {
   
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.findElement(By.xpath("//button[text()='    click   ']")).click();
	Set <String>handlevalue=driver.getWindowHandles();
	for(String handle:handlevalue) {
		driver.switchTo().window(handle);
		String titlepage= driver.getTitle();
		System.out.println("Title page this "+titlepage);
		
		if(titlepage.contains("Windows.htm")) {
			break;
		}
	//	driver.close();
	}
	
	}
	}

