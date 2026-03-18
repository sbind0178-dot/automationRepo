package automation;

public class MyAction_constructor_class1 {

static String CollageName="EVM";
	String StudentName;


	public static void main(String[] args) {
	//	Display();

		MyAction_constructor_class1 stu1 =new MyAction_constructor_class1("Ram");
		MyAction_constructor_class1 stu2 =new MyAction_constructor_class1("Ramesh");
		MyAction_constructor_class1 stu3 =new MyAction_constructor_class1("Roshan");
		MyAction_constructor_class1 stu4 =new MyAction_constructor_class1("Rohit");
		MyAction_constructor_class1 stu5 =new MyAction_constructor_class1("Rajesh");
		MyAction_constructor_class1 stu6 =new MyAction_constructor_class1("Mohan");
		MyAction_constructor_class1 stu7 =new MyAction_constructor_class1("Moharani");



	}
	public MyAction_constructor_class1(String name) {
		
		StudentName=name;
		System.out.println("Student name---"+StudentName);
		System.out.println("Collage name---"+CollageName);
		
	}
	public  void Display(String Name) {
		
		this.StudentName=Name;
		System.out.println("Student Name"+Name);
		
		
		
	}
}
