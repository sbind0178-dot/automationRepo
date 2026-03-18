package inheritance_Overloding_Concept;

public class Bus extends Car   {

	public static void main(String[] args) {

		Bus bu=new Bus();
		bu.meth1();
		bu.busMeth();

	}
	public void busMeth() {
		System.out.println("I am busMethod");
	}
}
