package collections;

import java.util.Scanner;

public class Prg9 {

	public static void main(String[] args) {
		
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the string...");
			String s1=scan.next();
			char[] c1=new char[s1.length()];
			for(int i=0;i<=(s1.length()-1);i++)
			{
				char ch=s1.charAt(i);
				c1[i]=ch;
			}
			
			//System.out.println(c1);
			System.out.println("Character elements are......");
			for(char k:c1)
			{
				System.out.print(k);
			}
	}

}
