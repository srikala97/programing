package google;

import java.util.Scanner;

public class String26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter a sentence...");
		String s1=scan.nextLine();
		String[] sarr=s1.split(" ");
		String rev="";
		for(int i=sarr.length-1;i>=0;i--)
		{
			rev=rev+sarr[i]+" ";
		}
		
	     System.out.println(rev);
		
		
		
		
	}

}
