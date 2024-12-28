package collections;

import java.util.Scanner;

public class Prg11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String -----");
		String s1=scan.next();
		
		int l=0;
		for(int i=0;i<=(s1.length()-1);i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				String tempstring=ch+"";
				int k= Integer.parseInt(tempstring);
				l=l+k;
			}
			
		}
		System.out.println("Sum of all digits is present in a given string...."+l);

	}

}
