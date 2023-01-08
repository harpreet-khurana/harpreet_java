package JavaAssignments;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the number :  ");
		int n = s1.nextInt();
		s1.close();
		Fibonacci obj = new Fibonacci();
		
		obj.PrintFibonacci(n);
		
	}
	public void PrintFibonacci(int n)
	{
		    int result=0, first=0,second=1;
			System.out.println("Fibonacci of "+n);
			System.out.print(first+" "+second);//printing 0 and 1    
			for(int i=0;i<=n;i++)
			{
				
				result = first + second;
				System.out.print(" "+result);
				first = second;
				second = result;
			}
	}
}   
