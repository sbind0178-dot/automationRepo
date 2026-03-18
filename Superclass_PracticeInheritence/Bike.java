package Superclass_PracticeInheritence;

public class Bike extends Vehicle {
	
	int x=30;
	

	public void Bike() {
		System.out.println("My vehicle name is Bike");
	}

	//vehicle ka kick bhi chale aur child ka kick method bhi call ho
	
	public void start() {
		System.out.println(this.x);
		super.horn();
		super.start();
		System.out.println("bike is working fine it start with keys");
		System.out.println("My Vehicle is starting with kick");

	}
	public void showType() {
		System.out.println("Vehicle Type");
		//This is used to access current class variable
	}
	public static void main(String []args ) {

		Vehicle bike=new Bike();// load child and parent and also show
		bike.start();
//		Vehicle ca= new Car(); 
// 		Vehicle vehicle=  new Bike();  //load child aur parent 
//		Vehicle vehicl=new Vehicle();
	}


}

