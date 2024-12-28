
//write a program to count no.of digits present in a given string
//eg:java5html7sql2;
//o/p: 3

package collections;

import java.util.Scanner;

public class Prg10 {
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string....");
		String s1=scan.next();
		int count=0;
		for(int i=0;i<(s1.length()-1);i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				count++;
			}
		}
		
		System.out.println("No. of digits in a given string..." +count);	
	
}
}
