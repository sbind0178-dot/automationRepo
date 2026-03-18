 package inheritance_Overriding_Concept;


    

//RunnerClass= ye le raha hai                                
            //child class        // parent class // ye de raha hai == .>>>>>>>esi ko inherite kahate hai
public class RunnerClass extends Animal {

	public static void main(String[] args) {
           
		Animal cc=new Dog();
	    cc.Lion();

	}

	@Override
	public void Lion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
	}
    
}
