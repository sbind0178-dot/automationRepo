package inheritance_Overloding_Concept;

import com.neilalexander.jnacl.crypto.verify_16;

//parent class: Vehicle
//Contains all Common for different types of vehicle
public class Vehicle {

	// Start the vehicle
	public void start() {       //method ka deffeshion
		
		System.out.println("Vehicle is starting with keys... ");
	}
//	
//	public static void main (String []args) {
//		
//		Vehicle Vehiss=new Vehicle();
//		Vehiss.Add(23);
//		
		
		
		
		
		
	//}
    public static void main (String  []args) {
    	Vehicle Vehiss=new Vehicle();
    	Vehiss.Add(56);
    	Vehiss.stop();
    
    }
    
	public void Add(int a) {
	System.out.println(a);
	}
	public void Add(int s,int d) {
		
	}
     public void Add(int x,int y,int z) {
		
	}
     
     // horn
     public void Horn() {
  		System.out.println("Vehicle horn is sounding... ");

 	}
       //stop the vehicle
     public void stop() {
  		System.out.println("Vehicle is stopping... " );

 	}
     //Fuel the vehicle
     public void refuel() {
  		System.out.println("Vehicle is  refueling...  ");

 	}
     //Display vehicle type
     public void VehicleType() {
 		System.out.println("This is a geneic vehicle... ");
 	}
        
}
