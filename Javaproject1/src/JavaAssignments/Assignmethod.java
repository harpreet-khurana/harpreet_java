package JavaAssignments;

public class Assignmethod {

	public void method0()
	{
		System.out.println("Default Method");
		this.method1(1);
	}
	public void method1(int a)
	{
		System.out.println("One parametrised Method");
		this.method2(1, 2);
	}
	public void method2(int a, int b)
	{
		System.out.println("Two parameterised Method");
	}
	public void method3(int a, int b, int c)
	{
		System.out.println("Three parameterised Method");
		this.method0();
	}
	public void method4(int a, int b, int c, int d)
	{
		this.method3(1, 2, 3);
		System.out.println("Four parameterised Method");
	}
	
	public static void main(String[] args)
	{
		Assignmethod refObj = new Assignmethod();
		refObj.method4(1, 2, 3, 4);
	}
}


