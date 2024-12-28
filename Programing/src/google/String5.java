package google;

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println(" Enter Given String data...");
	String s1=scan.next();
	System.out.println("Enter character data...");
	char ch1=scan.next().charAt(0);
	int count=0;
	for(int i=0;i<s1.length();i++)
	{
		char ch2=s1.charAt(i);
		if(ch1==ch2)
		{
			count++;
		}
	}
	if(count>0) 
	{
		System.out.println(" Given character is present...");
	}
	else
	{
		System.out.println(" given charactr is not present...");
	}
		
		
		
		
		
	}

}
