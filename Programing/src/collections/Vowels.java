
//Write a program to count no.of vowels present in a given string.....
package collections;

import java.util.Scanner;

public class Vowels 
{
	
	public static void main(String[] args)
	{
		
	Scanner scan=new Scanner(System.in);
	System.out.println(" Enter string...");
	String s1=scan.next();
	int count=0;
	for(int i=0;i<=(s1.length()-1);i++)
	{
	
		char c=s1.charAt(i);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		{
			
			count++;
			
		}
		
	}
		
	System.out.println(count);	
	}
		
}
