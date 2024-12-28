package collects;

import java.util.Scanner;

public class Compare_strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter First String ...");
		String S1=scan.next();
		System.out.println("Enter Second String...");
		String S2=scan.next();
		if(S1.equalsIgnoreCase(S2))
		{
			System.out.println(" Both are similar...");
			
		}
		else
		{
			System.out.println(" Both are not similar...");
		}
		
		
		}
		
		
		
		
	}


