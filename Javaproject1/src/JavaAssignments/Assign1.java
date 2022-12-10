package JavaAssignments;

//Class name - Assign1
public class Assign1
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
	
	public void expectedresult()
	{
		int exResult = (((((10+2)+2)-2)*2)/2);
		System.out.println("Expected Result : " + exResult);
	}
	
	public static void main(String args[])
	{
		Assign1 obj = new Assign1();
		int result1 = obj.sum(10, 2);
		int result2 = obj.sum(result1, 2);
		int result3 = obj.sub(result2, 2);
		int result4 = obj.mult(result3, 2);
		int result5 = obj.div(result4, 2);
		obj.expectedresult();
		
		System.out.println("Actual result : " + result5); 
	}
}