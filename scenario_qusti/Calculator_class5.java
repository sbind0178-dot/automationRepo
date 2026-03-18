package scenario_qusti;

public class Calculator_class5 {

	public static void main(String[] args) {
		
		Calculator_class5 cls= new Calculator_class5();
		cls.display("Hello");
	}
    public void display(Object o) {
    	System.out.println(o);
    }
    public void display(String s) {    ///it will be run call method display("Hello")
    	System.out.println(s);
    }
}
