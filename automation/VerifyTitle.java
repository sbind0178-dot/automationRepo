package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) throws InterruptedException {
		
		gmail();
		admin();
		office();
		Teacher();
	}
      public static void gmail() {
    	  String name1="Test@Gmail.com";
    	  String name2="test@Gmail.com";
    	  
    	  if(name1.equalsIgnoreCase(name2)) {
    		  System.out.println("matched passed");
    		  
    	  }else{
    		  
    		  System.out.println("matched failed--");
    	  }
      }
		public static void admin() {
			
			String name1="admin";
			String name2="admin";
			
			if(name1.equals(name2)) {
			System.out.println("username validation paased");
			
			}else{
				System.out.println("username validation failed");
			} 
    		  
    	  }
	
		 public static void office() {
	    	 String name1="Monday";
	    	 String name2="sunday";
	    	 if(name1.equalsIgnoreCase(name2)) {
	    		 System.out.println("Weekday-work Hard!passed");
	    		 
	    	 }else{
	    		 
	    		 System.out.println("Holiday-Relex! failed");
	    		 	 
	    	 }
      }
		 public static void Teacher() {
			 int a=40;
			 int b=10;
			if(a>b) {
			System.out.println("Student paased");
			}else{
				System.out.println("Student failed");
			}
			
		 }
}