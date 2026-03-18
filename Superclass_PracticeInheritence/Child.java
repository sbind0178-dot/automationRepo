package Superclass_PracticeInheritence;

import inheritance.ParentClass;

public class Child extends ParentClass  {
	
   	
public static void main (String []args) {
	Child cc=	new Child();
	cc.showMessage();
	
}
	public void methodA() {
		System.out.println("child class");
	}

	public void showMessage() {
		 this.methodA();
		 super.methodA();
		
       
	}

}
