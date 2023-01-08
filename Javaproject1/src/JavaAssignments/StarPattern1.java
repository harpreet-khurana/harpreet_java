package JavaAssignments;

import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the number :  ");
		int n = s1.nextInt();
		s1.close();
		StarPattern1 obj = new StarPattern1();
		
		obj.PrintPattern1(n);
		obj.PrintPattern2(n);
		obj.PrintPattern3(n);
		
	}
	public void PrintPattern1(int n)
	{
		  	for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}
	public void PrintPattern2(int n)
	{
		  	for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
	}
	public void PrintPattern3(int n)
	{
		  	for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
	}
}   
