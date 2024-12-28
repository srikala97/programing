package collections;

import java.util.Scanner;

public class Prg14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the number");
		int num=scan.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(" Given number is prime");
		}
		else
		{
			System.out.println(" Given number is not prime");

		}
		
		
	}

}
