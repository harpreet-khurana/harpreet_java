package JavaAssignments;

import java.util.Scanner;

public class Swap1
{
	int var1,var2,var3;

	public static void main(String[] args)
	{
				Swap1 obj = new Swap1();
				obj.UserInput();
	}
		
		public void UserInput()
		{
				Scanner s1 = new Scanner(System.in);
				Swap1 obj = new Swap1();
				System.out.println("Please enter the values for first variable :  ");
				obj.var1 = s1.nextInt();
				System.out.println("Please enter the values for second variable : ");
				obj.var2 = s1.nextInt();
				System.out.println("Initial value var1 : " + obj.var1);
				System.out.println("Intitial value var2 : " + obj.var2);
							
				obj.swap_one();
				System.out.println("Resetting class variables for assignment 2");
				obj.swap_one(); //resetting the user input for assignment 2
				obj.swap_two();
				s1.close();
		}
		public void swap_one()
		{
				int var3 = var1;
			    var1 = var2;
				var2 = var3 ;
				System.out.println();
				System.out.println("Using third variable");			
				System.out.println("Swapped value var1 : " + var1);
				System.out.println("Swapped value var2 : " + var2);
		}
		public void swap_two()
		{   
				var1 = var1+var2;
				var2 = var1-var2;
				var1 = var1-var2;	
				System.out.println();
				System.out.println("Without third variable");
				System.out.println("Swapped value var1 : " + var1);
				System.out.println("Swapped value var2 : " + var2);
		}
}
