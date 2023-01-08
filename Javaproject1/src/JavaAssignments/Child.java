package JavaAssignments;

public class Child extends Parent {

	public Child()
	{
		this(1,2);
		System.out.println("Child default constructor");
	}
	public Child(int a)
	{
		this(1,2,3,4);
		System.out.println("Child one parameterized constructor");
	}
	public Child(int a,int b)
	{
		super(1);
		System.out.println("Child two parameterized constructor");
	}
	public Child(int a,int b,int c)
	{
		this(1);
		System.out.println("Child three parameterized constructor");
	}
	public Child(int a,int b,int c,int d)
	{
		this();
		System.out.println("Child four parameterized constructor");
	}
	public static void main(String[] args)
	{
		Child child = new Child(1,2,3);
		
	}
}
