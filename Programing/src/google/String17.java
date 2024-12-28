package google;

import java.util.Scanner;

public class String17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence...");
		String s1=scan.nextLine();
		System.out.println("Index is avalibale from 0 to "+(s1.length()-1));
		System.out.println(" Enter the start index..");
		int start=scan.nextInt();
		//System.out.println(" Enter the second index...");
		//int end=scan.nextInt();
		String s2="";
		for(int i=start;i<=(s1.length()-1);i++)
		{
			char c1=s1.charAt(i);
			s2=s2+c1;
			
			
	     }
	
		System.out.println(s2);
		
		
	}

}
