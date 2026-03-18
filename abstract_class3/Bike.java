package abstract_class3;

public class Bike  extends Vehicle{
 
	public void horn() {
		System.out.println("bike horn is sounding ...Horn");
	}
	
	public void Bike() {
		System.out.println("my name is child constructor...");
	}
	
	public Bike () {
		System.out.println("int ");
		
	}
	
	public Bike(String location,int a) {

		//this(a);
	}
}
