package google;

import java.util.Scanner;

public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter a string...");
		String s1=scan.next();
		String s2="";
		for(int i=(s1.length()-1);i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
		
		System.out.println(s2);
		
		
	}

}
