package google;

import java.util.Scanner;

import org.checkerframework.checker.optional.qual.Present;

public class String19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string1...");
		String s1= scan.nextLine();
		System.out.println("Enter the string2...");
		String s2=scan.nextLine();
        int status=s1.compareTo(s2);
        if(status>0)
        {
        	System.out.println(s1+ " is greater than "+s2);
        }
        else
        {
        	System.out.println(s2+"is greater than "+s1);
        }
	
		
	}		
}
