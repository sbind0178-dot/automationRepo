package Superclass_PracticeInheritence;

import inheritance.ParentClass1;

public class Chil {
	
	int value=1000;
	
	
	public static void main(String[] args) {
		Chil  cc=new Chil ();
     	cc.checkValues();	
	}
     public void checkValues() {
    	 System.out.println(value);
    	 System.out.println(this.value);
    	// System.out.println(super.value);

     }
}
