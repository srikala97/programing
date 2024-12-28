package dec14;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	
	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the string1....");
		String s1=scan.nextLine();
		System.out.println(" Enter the string2...");
		String s2=scan.nextLine();
		String s3=s1.replaceAll("\\s","");
		String s4=s2.replaceAll("\\s","");
		//System.out.println(s3);
		//System.out.println(s4);
		if(s3.length()!=s4.length())
		{
			System.out.println("Not an anagram....");
		}
		else
		{
			char c1[]=s3.toLowerCase().toCharArray();
			char c2[]=s4.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);

			if(Arrays.equals(c1, c2))
			{
				
				System.out.println("It is anagram....");
					
			}
			else
			{
				System.out.println(" Not an anagram....");

			}
		
			
		}
		
	}
	
	
	
	
	
}
