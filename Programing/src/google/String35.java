package google;

import java.util.Scanner;

public class String35 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the string....");
		String s1=scan.next();
		char[] c=new char[s1.length()];
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			c[i]=ch;
			//System.out.println(c[i]);
		}
		for(char k: c)
		{
			System.out.println(k);
		}
		
		
	}

}
