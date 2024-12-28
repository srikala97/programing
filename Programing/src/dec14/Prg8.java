package dec14;

import java.util.Scanner;

public class Prg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the String...");
		String s1=scan.next();
		System.out.println(" Enter the integer ....");
		int num=scan.nextInt();
		System.out.println(" Enter the boolean...");
		boolean b1=scan.nextBoolean();
		System.out.println(" Enter the character....");
		char c=scan.next().charAt(0);
		System.out.println(s1+" "+num+" "+b1+" "+c+" ");
		
		
		
	}

}
