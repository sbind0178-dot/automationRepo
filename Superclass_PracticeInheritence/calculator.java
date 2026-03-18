package Superclass_PracticeInheritence;

public class calculator {

	public static void main(String[] args) {

		calculator cc=	new calculator();
		 cc.printResult(); 
	}
     public void calculate() {
    	 printResult();
    	 this.printResult();
     }
     public void printResult() {
    	 
    	 System.out.println("Result");
     }
     
     }
