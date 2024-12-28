package google;

import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the sentence...");
		String s1=scan.nextLine();
		System.out.println("Index are available from 0"+(s1.length()-1));
		System.out.println("Enter the start index...");
		int start=scan.nextInt();
		System.out.println("Enter end index...");
		int end=scan.nextInt();
		String s2="";
		for(int i=start;i<=end;i++)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
			
		}
		
		System.out.println(s2);
		
		
	}

}
