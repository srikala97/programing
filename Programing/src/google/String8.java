package google;

import java.util.Scanner;

public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string data...");
		String s1=scan.next();
		char[] c1=new char[s1.length()];
		for(int i=0;i<=s1.length()-1;i++)
		{
			c1[i]=s1.charAt(i);
		}
		
		System.out.println(c1);
		
		
		
	}

}
