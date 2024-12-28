package google;

import java.util.Scanner;

public class String24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence...");
		String s1=scan.nextLine();
		String[] sarr=s1.split(" ");
		String s2="";
		//String s3="";
		for(int i=0;i<sarr.length;i++)
		{
			String word=sarr[i];
			String s3="";
			for(int j=word.length()-1;j>=0;j--)
			{
				
			   s3=s3+word.charAt(j);
			    
			}
			
			s2=s2+s3+" ";
			
		}
		System.out.println(s2);	
		
	}

}
