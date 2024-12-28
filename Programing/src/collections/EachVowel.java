
//Write a program to count no.of each vowel present on given string.....

package collections;

import java.util.Scanner;

public class EachVowel {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string....");
		String s1=scan.next();
		int count=0;
		int ac=0; int ec=0;int ic=0;int oc=0;int uc=0;
		
		for(int i=0;i<=(s1.length()-1);i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a')
			{
				ac++;
			}
			else if(ch=='e')
			{
				ec++;
			}
			else if(ch=='i')
			{
				ic++;
			}
			else if(ch=='o')
			{
				oc++;
			}
			else if (ch=='u')
			{
				uc++;
			}
		}
		System.out.println("No.of Vowel a ="+ac);
		System.out.println("No.of Vowel e ="+ ec);
		System.out.println("No.of Vowel i ="+ic);
		System.out.println("No.of Vowel o ="+oc);
		System.out.println("No.of Vowel u ="+uc);
	}
	
	
	
	
	
	
}
