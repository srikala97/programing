package search;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the string1...");
		String s1=scan.next();
		System.out.println(" Enter the string2...");
		String s2=scan.next();
		String s3=s1.replaceAll("\\s", "");
		String s4=s2.replaceAll("\\s", "");
		if(s3.length()!=s4.length())
		{
			
			System.out.println(" Not a Anagram...");
			
		}
		else
		{
			char c1[]=s3.toLowerCase().toCharArray();
			char c2[]=s3.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram....");
				
			}
			else
			{
				System.out.println(" Not a  Anagram");
			}

		}
       
		
		
	}

}
