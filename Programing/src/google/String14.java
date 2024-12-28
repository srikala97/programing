package google;

import java.util.Scanner;

public class String14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence...");
		String s1=scan.nextLine();
		System.out.println("Enter the string...");
		String s2=scan.next();
		if(s1.contains(s2))
		{
			System.out.println("Given word is present");
		}
		else
		{
			System.out.println("Given word is not present...");
		}
		
		
		
		
		
	}

}
