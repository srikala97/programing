package google;

import java.util.Scanner;

public class String27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence...");
		String s1=scan.nextLine();
		String[] sarr=s1.split(" ");
		String reverseword="";
		for(int i=sarr.length-1;i>=0;i--)
		{
			String word=sarr[i];
			String reverse = "";
			for(int j=word.length()-1;j>=0;j--)
			{
				
				reverse=reverse+word.charAt(j);
			}
			reverseword=reverseword+reverse+" ";
			
		}
		
		
		
		System.out.println(reverseword);
		
		
	}

}
