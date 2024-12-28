package dec14;

import java.util.Scanner;

public class Prg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the string...");
		String s1=scan.next();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
		
		System.out.println(" number of vowels in a string..."+count);
		
		
	}

}
