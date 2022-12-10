package JavaAssignments;

//Class name - Student
public class Student{
	
	int rollNo;
	int age;
	
	public void display1()
	{
		System.out.println("Welcome to all of you!!");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main (String[] args)
	{
		Student student1 = new Student();
		student1.age = 30;
		student1.rollNo = 123;
		
		System.out.println("Student1 age  " + student1.age);
		System.out.println("Stuent1 roll number  " + student1.rollNo);
		
		student1.display1();
		student1.display2();
		
	}
}