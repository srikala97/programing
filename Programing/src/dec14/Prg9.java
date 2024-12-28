package dec14;

import java.util.Scanner;

public class Prg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the string...");
		String s1=scan.next();
		System.out.println(" Enter the character...");
		char c=scan.next().charAt(0);
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch==c)
			{
				count++;
			}
		}
		
		System.out.println(" count of given character..."+count);
		
		
	}

}
