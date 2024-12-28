
//Write a program to count given character in a given string.....
package collections;

import java.util.Scanner;

public class Prg2 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter given String....");
		String s1=scan.next();
		System.out.println("Enetr a given character....");
		char c=scan.next().charAt(0);
		int count=0;
		for(int i=0;i<=(s1.length()-1);i++)
		{
			char ch1=s1.charAt(i);
			if(c==ch1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
	
	
	
	
	
}
