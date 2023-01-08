package JavaAssignments;

public class Assignmethod2 {

	public void method0()
	{
		System.out.println("Default method");
	}
	public void method1(int a)
	{
		System.out.println("One parameterized method");
	}
	public void method2(int a, int b)
	{
		System.out.println("Two parameterized method");
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("Three parameterized method");
	}
	public void method4(int a,int b,int c,int d)
	{
		this.method3(a, b, c);
		this.method0();
		this.method1(a);
		this.method2(a, b);
		System.out.println("Four parameterized method");
	}
	public static void main(String[] args) {
	
		Assignmethod2 refObj = new Assignmethod2();
		refObj.method4(1, 2, 3, 4);
	}
}
