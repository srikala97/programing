
//Write a program to enter a sentence and retrieve substring from the sentence based on the indexno...

package collections;

import java.util.Scanner;

public class Prg8 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence...");
		String s1=scan.nextLine();
		System.out.println("Index is available from 0 to"+(s1.length()-1));
		System.out.println("Start of index");
		int i=scan.nextInt();
		System.out.println("End of index");
		int j=scan.nextInt();
		String s2="";
		for(int k=i;k<=j;k++)
		{
			
			char ch=s1.charAt(k);
			s2=s2+ch;
			
			
		}
		System.out.println("Substring is :"+s2);
	}

}
