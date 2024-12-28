

//write a program of comparing two strings by eqaulsIgnorecase() method.....
package collections;

import java.util.Scanner;

public class Twostrings2 {

	
public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string....");
		String s1=scan.next();
		System.out.println("Enter string....");
		String s2=scan.next();
		//int s2=scan.nextInt();
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Both strings are similiar....");
		}
		else
		{
			System.out.println("Both strings are not similiar....");

		}
		
		
		
}

}
