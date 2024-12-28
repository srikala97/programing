package collects;

import java.util.Scanner;

public class Substring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter sentence...");
		String S1=scan.nextLine();
		System.out.println("Index is avaalibale is from 0 to " +(S1.length()-1));
		int si=scan.nextInt();
		String s2="";
		for(int i=si;i<=S1.length()-1;i++)
		{
			char ch=S1.charAt(i);
			s2=s2+ch;
		}
		
		System.out.println(" Given String..."+S1);
		System.out.println(" Given String..."+s2);
		
	}

}
