package JavaAssignments;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the number :  ");
		int n = s1.nextInt();
		s1.close();
		Table obj = new Table();
		
		obj.PrintTable(n);
		
	}
	public void PrintTable(int n)
	{
		
			System.out.println("Table of "+n);
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+ " X "+i+" = "+n*i);
			}
	}
}   
