package collections;

import java.util.Scanner;

public class Prg16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the number....");
		int num=scan.nextInt();
		int rev=0;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
			
		}
		
		System.out.println(rev);
		
	}

}
