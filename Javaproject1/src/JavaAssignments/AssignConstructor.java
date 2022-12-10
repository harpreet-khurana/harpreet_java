package JavaAssignments;

public class AssignConstructor
{
	public AssignConstructor()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	public AssignConstructor(int a)
	{
		this();
		System.out.println("One parameterised Constructor");
	}
	public AssignConstructor(int a, int b) 
	{	
		this (1);
		System.out.println("Two parameterised Constructor");
	}
	public AssignConstructor(int a, int b, int c)
	{
		System.out.println("Three parameterised Constructor");
	}
	public AssignConstructor(int a, int b, int c, int d)
	{
		this (1,2);
		System.out.println("Four parameterised Constructor");
	}
	
	public static void main(String[] args)
	{
		int w=1,x=2, y=3,z=4;
		AssignConstructor obj1 = new AssignConstructor(w,x,y,z);
	}
}