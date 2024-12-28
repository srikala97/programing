package collects;

import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string data...");
		String c= scan.next();
		System.out.println(" Enter Boolean data...");
		Boolean d= scan.nextBoolean();
		System.out.println("Enter Character data...");
		char ch=scan.next().charAt(0);
		System.out.println(c);
		System.out.println(d);
		System.out.println(ch);
		
		
		
	}

}
