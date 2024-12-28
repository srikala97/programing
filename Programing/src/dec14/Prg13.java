package dec14;

import java.util.Scanner;

public class Prg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the sentence....");
		String s1=scan.nextLine();
		System.out.println(" Enter the start index");
		int start=scan.nextInt();
		System.out.println(" Enter the last index....");
		int last=scan.nextInt();
		String s2=s1.substring(start, last+1);
		System.out.println(s2);
		
		
		
		
	}

}
