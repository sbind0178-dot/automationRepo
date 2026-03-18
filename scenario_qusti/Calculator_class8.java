package scenario_qusti;

public class Calculator_class8 {

	public static void main(String[] args) {
		Calculator_class8 cls=	new Calculator_class8();
		cls.send(02, "b");    //it will be compile time error
		                      
	}
    public void send(int a ,String x) {
    	
    	System.out.println(a);
 	   System.out.println( x);

    }
   public void send(String x,int a) {
	   
	   System.out.println( x);
	   System.out.println( a);

   }
}
