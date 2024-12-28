package google;

import java.util.Scanner;

public class String12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st string...");
		String s1=scan.next();
		System.out.println("Enter the 2nd string...");
		String s2=scan.next();
		int status=s1.compareToIgnoreCase(s2);
		if(status>0)
		{
			System.out.println(" Strings are equal...");
		}
		else if(status<0)
		{
			System.out.println("Strings are not equal...");
		}
		else
		{
			System.out.println(" Strings are same...");
		}
		
		
		
		
		
	}

}
