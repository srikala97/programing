package collects;

import java.util.Scanner;

public class Character_Present_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String...");
		String s=scan.next();
		System.out.println(" Enter the Character..");
		char ch1=scan.next().charAt(0);
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch2=s.charAt(i);
			if(ch1==ch2)
			{
				count++;
			}
			
			
		}
		if(count>0)
		{
		System.out.println("Given string is present..");
		}
		else
		{
			System.out.println(" Given string is not present...");
		}
		
		
	}

}
