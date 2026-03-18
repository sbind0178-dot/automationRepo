package scenario_qusti;

public class Calculator_class2 {

	public static void main(String[] args) {
      
		Calculator_class2 cls=	new Calculator_class2();
		cls.print(45.6f);
		
	}
    public void print(String name) {
    	System.out.println( name); 
    	
    }
    public void print(int age) {
    	System.out.println(age);
    }
    public void print(double wait) {    //// it will be run call method print (45.6f)
    	System.out.println(wait);
    }
}
