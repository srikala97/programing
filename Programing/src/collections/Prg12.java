package collections;

import java.util.Scanner;

public class Prg12 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st String-----");
		String s1=scan.next();
		System.out.println("Enter the 2nd String-----");
		String s2=scan.next();
		int status=s1.compareTo(s2);
		if(status>0)
		{
			System.out.println(s1+ " is greater than "+s2);
		}
		else if(status<0)
		{
			System.out.println(s1+ " is less than "+s2);
		}
		else 
		{
			System.out.println(s1+ " is equal to  "+s2);
		}
		
		

	}

}
