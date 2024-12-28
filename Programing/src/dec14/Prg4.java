package dec14;

import java.util.Scanner;

public class Prg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the number...");
		int n=scan.nextInt();
		int rem=0;
		int rev=0;
		while(n!=0)
		{
			rem=n%10;
		    rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(" reverse a number..."+rev);
		
		
		
		
	}

}
