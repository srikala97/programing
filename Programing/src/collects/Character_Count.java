package collects;

import java.util.Scanner;

public class Character_Count {

	public static void main(String args[])
	{
	int count=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter String..");
	String s=scan.next();
	System.out.println("Enter Character...");
	char ch1=scan.next().charAt(0);
	for(int i=0;i<=s.length()-1;i++)
	{
		char ch2=s.charAt(i);
		if(ch1==ch2)
		{
			count++;
		}
	}
	
	System.out.println(s);
	System.out.println(ch1);
	System.out.println("count is:" +count);


	}	
}
