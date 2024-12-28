package google;

import java.util.Scanner;

public class String13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string...");
		String s1=scan.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
			
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Given string is palindrome...");
		}
		else
		{
			System.out.println("Given string is not palindrome...");
		}
			
	}

}
