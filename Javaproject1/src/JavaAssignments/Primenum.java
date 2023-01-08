package JavaAssignments;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Prime number validator ");
		System.out.println("Please enter the number :  ");
		int n = s1.nextInt();
		s1.close();
		Primenum obj = new Primenum();
		
		boolean result = obj.IsPrimeNumber(n);
		
		if (result == true)
		{
			System.out.println(n + " is a Prime number");
		}
		else
		{
			System.out.println(n + " is NOT a Prime number");
		}
	}
	public boolean IsPrimeNumber(int n)
	{
		boolean result = false;
		if(n>1)
		{
			int mid = n/2, i;
			for(i=2;i<=mid;i++)
			{
				if (n%i==0)
				{
					return false;
				}
				else
				{
					result=true;
				}
			}
		}
		return result;
	}
}   
