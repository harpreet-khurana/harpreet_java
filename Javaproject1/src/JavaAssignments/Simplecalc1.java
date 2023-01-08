package JavaAssignments;

import java.util.Scanner;

public class Simplecalc1 {
	
	int a1, a2, a3, a4, a5, a6;
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int subtract(int a, int b)
	{
		return a-b;
	}
	public int multiply(int a, int b)
	{
		return a*b;
	}
	public int divide(int a, int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		Simplecalc1 obj = new Simplecalc1();
		obj.UserInput();
		}
		
		public void UserInput()
		{
			Scanner s1 = new Scanner(System.in);
			Simplecalc1 obj = new Simplecalc1();
			System.out.println("Please enter the values for x1: ");
			obj.a1 = s1.nextInt();
			System.out.println("Please enter the values for x2: ");
			obj.a2 = s1.nextInt();
			System.out.println("Please enter the values for x3: ");
			obj.a3 = s1.nextInt();
			System.out.println("Please enter the values for x4: ");
			obj.a4 = s1.nextInt();
			System.out.println("Please enter the values for x5: ");
			obj.a5 = s1.nextInt();
			System.out.println("Please enter the values for x6: ");
			obj.a6 = s1.nextInt();
			
			obj.display1();
			obj.display2();
			s1.close();
		}
		
		public void display1()
		{	
			int res1 = sum(a1,a2);
			int res2 = sum(res1,a3);
			int res3 = subtract(res2,a4);
			int res4 = multiply(res3,a5);
			float res5 = divide(res4,a6);
			
			System.out.println("Assignment1 Result : " + res5);
		}

		public void display2()
		{	
			int res1 = multiply(a1,a2);
			int res2 = subtract(res1,a3);
			int res3 = sum(res2,a4);
			int res4 = subtract(res3,a5);
			float res5 = divide(res4,a6);
			
			System.out.println("Assignment2 Result : " + res5);
		}
		
}

