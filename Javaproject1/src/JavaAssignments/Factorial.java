package JavaAssignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the number :  ");
		int n = s1.nextInt();
		s1.close();
		Factorial obj = new Factorial();
		
		obj.PrintFactorial(n);
		
	}
	public void PrintFactorial(int n)
	{
		    int result=1;
			System.out.println("Factorial of "+n);
			for(int i=1;i<=n;i++)
			{
				result = result*i;
				System.out.println(result);
			}
	}
}   
