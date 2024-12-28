package google;

import java.util.Scanner;

public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string....");
		String s1=scan.next();
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				count++;
			}
		}
		
		System.out.println("Number of digits: "+count);
		
	}

}
