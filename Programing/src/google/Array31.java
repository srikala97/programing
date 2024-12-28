package google;

import java.util.Scanner;

public class Array31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the number...");
		int number=scan.nextInt();
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println(" Given number is prime number...");
		}
		else
		{
			System.out.println(" Given number is not prime number...");
		}
		
		
	}

}
