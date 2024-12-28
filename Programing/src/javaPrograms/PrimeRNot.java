
//Write a program to check whether given number is prime or not..

package javaPrograms;

public class PrimeRNot {

	public static void main(String[] args) {
		int n=7;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("prime number....");
		}
		else
		{
			System.out.println("Not a prime Number....");
		}



	}

}
