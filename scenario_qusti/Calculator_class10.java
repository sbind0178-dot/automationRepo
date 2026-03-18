package scenario_qusti;

public class Calculator_class10 {

	public static void main(String[] args) {
     
		Calculator_class10 cls=	new Calculator_class10();
		cls.display(10);
	}
      public void display(int a) {             //it will be run call method display(10);
    	  System.out.println("i am int "+a);
      }
      public void display(int...a) {
    	  System.out.println("i am int... "+a);
      }
}
