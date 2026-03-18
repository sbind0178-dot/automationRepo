package scenario_qusti;

public class Calculator_class4 {

	public static void main(String[] args) {
    
		Calculator_class4 cls=	new Calculator_class4();
		cls.area(5,5);
	}
     public void area(int side) {
    	 System.out.println(side); 
    	 
     }
     public void area(int length,int breadth) {    //  it will be run call  method area(5,5)
    	 System.out.println(length); 
    	 System.out.println(breadth);

     }
}
