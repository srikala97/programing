package dec14;

import java.util.Scanner;

public class Prg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the Sentence...");
		String s1=scan.nextLine();
		System.out.println(" Enter the start index...");
		int start=scan.nextInt();
		System.out.println(" Enter the end index...");
		int end=scan.nextInt();
		String s2="";
		for(int i=start;i<=end;i++)
		{
			char c=s1.charAt(i);
			s2=s2+c;
			
		}
		System.out.println(s2);
		
	}

}
