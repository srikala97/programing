
//write a program to check whether given string is palindrome or not.....

package collections;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st String-----");
		String s1=scan.next();
		String s2="";
		for(int i=(s1.length()-1);i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Given String is Palindrome....");
		}
		else
		{
			System.out.println("Given String is not Palindrome....");
		}
		
		
	}

}
