
//write a program to check whether given character is present in the given string....

package collections;

import java.util.Scanner;

public class Prg7 {

	/*public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string....");
		String s1=scan.next();
		System.out.println("Enter char....");
		char c=scan.next().charAt(0);
		for(int i=0;i<=(s1.length()-1);i++)
		{
			char ch=s1.charAt(i);
			if(ch==c)
			{
				System.out.println("character is present...");
				break;
			}
			
		}
		
		*/      //(OR)
	
	
		
       public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string....");
		String s1=scan.next();
		System.out.println("Enter char....");
		char c=scan.next().charAt(0);
		for(int i=0;i<=(s1.length()-1);i++)
		{
			char ch1=s1.charAt(i);
			if(ch1==c)
			{
				count++;
			}
			
		}
		if(count>0)
		{
			System.out.println("Given character is present....");
		}
		else
		{
			System.out.println("Given character is not present....");
		}
		
	}

}
