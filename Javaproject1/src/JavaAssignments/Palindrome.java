package JavaAssignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Palindrome validator ");
		System.out.println("Please enter the value :  ");
		String input = s1.nextLine();
		s1.close();
	
		Palindrome obj = new Palindrome();
		
		boolean result = obj.IsPalindrome(input);
		
		if (result == true)
		{
			System.out.println(input + " is a Palindrome");
		}
		else
		{
			System.out.println(input + " is NOT a Palindrome");
		}
	}
	public boolean IsPalindrome(String input)
	{
		boolean result = false;
		int len = input.length();
		String reverse = ""; 
		for(int i=len-1; i>=0;i--)
		{
			reverse = reverse+ input.charAt(i);
		}
		result = input.equals(reverse);
		return result;
	}
}   
