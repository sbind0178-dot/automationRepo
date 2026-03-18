package abstract_class1;

public class Worker extends Human {
	
	   public  String name;   

	   public Worker(String Name) {  // Constructor create method
		   super(23);
		  this.name=Name; 
		  
		  System.out.println("I am Worker");
		  
	   }
	   
	   public void eat() {
		    System.out.println("eat anywhere");
			}
	   
	   
		public void cometoOfficeOnTime() {
			
		}
	    public void levalFromOfficeOnTime() {
			System.out.println(name+" exit on time ");
		
	    
	    }

}
