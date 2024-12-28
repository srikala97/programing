package scanner;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the string data...");
	String s1=scan.next();
	int count=0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
		}
		
	}
	
	System.out.println("Given string is:"+s1);
	System.out.println("Number of vowels is present is:"+count);
				
}

}
