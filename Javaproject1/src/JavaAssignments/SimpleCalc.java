package JavaAssignments;
public class SimpleCalc
{
	public int sum(int a, int b)
	{
		return a + b ;
	}
	public int sub(int a, int b)
	{
		return a - b;
	}
	public int mult(int a, int b)
	{
		return a * b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public int expectedResultA1()
	{
		return (((((10+2)+2)-2)*2)/2);
	}
	public int expectedResultA2()
	{
		return (((((10*2)-2)+2)-2)/2);
	}
	public void display1()
	{
		SimpleCalc obj = new SimpleCalc();
		int result1 = obj.sum(10, 2);
		int result2 = obj.sum(result1, 2);
		int result3 = obj.sub(result2, 2);
		int result4 = obj.mult(result3, 2);
		int actualResult = obj.div(result4, 2);
		int exResult = obj.expectedResultA1();
		
		System.out.println("Expected Result Assignment1 : " + exResult);
		System.out.println("Actual result Assignment1 : " + actualResult); 
	}
	public void display2()
	{
		SimpleCalc obj = new SimpleCalc();
		int result1 = obj.mult(10, 2);
		int result2 = obj.sub(result1, 2);
		int result3 = obj.sum(result2, 2);
		int result4 = obj.sub(result3, 2);
		int actualResult = obj.div(result4, 2);
		int exResult = obj.expectedResultA2();
		
		System.out.println("Expected Result Assignment2 : " + exResult);
		System.out.println("Actual result Assignment2 : " + actualResult); 
	}
	public static void main(String args[])
	{
		SimpleCalc obj = new SimpleCalc();
		obj.display1();
		obj.display2();
		  
	}
}