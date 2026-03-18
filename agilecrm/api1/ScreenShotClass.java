package agilecrm.api1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotClass {
	
	public static void main(String[] args) throws IOException {
	//File fileurl=	new File("C:\\Users\\SUNIL BIND\\Desktop\\sunilname\\devid");
	
//	fileurl.mkdir(); 
//	fileurl.mkdirs();   /// All folder ke andar file  banana hai
	
	
//		File fileobj=   new File("C:\\Users\\SUNIL BIND\\Desktop\\Sunil.txt.txt");
//		fileobj.delete();
//	 boolean statusfile=	fileobj.exists();
//	  if(statusfile==true) {
//		  System.out.println("files is show");
//	  }else{
//		  System.out.println("files is not show ");
//	  }
	
	
	ChromeDriver driver= new ChromeDriver();
	
	driver.get("http://localhost:8888/");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();


	TakesScreenshot tss=(TakesScreenshot)driver;
       File scrfile=	tss.getScreenshotAs(OutputType.FILE);
	   File fileurl=new File("C:\\Users\\SUNIL BIND\\Desktop\\screenshot_Vtiger.png");
        FileUtils.copyFile(scrfile, fileurl);
 	   
	
	
	
	
	
	
	}

}
