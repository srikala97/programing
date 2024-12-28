

//Write a program on scanner class....
package collections;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Integer data...");
		int i=scan.nextInt();
		System.out.println("Enter the string data...");
		String s= scan.next();
		System.out.println("Enter Boolean data....");
		Boolean b=scan.nextBoolean();
		System.out.println("Enter character data....");
		char c=scan.next().charAt(0);
		System.out.println("Data are.....");
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	
	
	
	
	
	
	
	
}
