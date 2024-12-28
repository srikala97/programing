package google;

import java.util.Scanner;

public class String33 {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println(" Enter a sentence...");
     String s1=scan.nextLine();
     System.out.println(" enter the start index..");
     int startindex=scan.nextInt();
     System.out.println(" enter the end index..");
	 int endindex=scan.nextInt();
	 String finalstring=s1.substring(startindex, endindex+1);
	// for(int i=startindex;i<=endindex;i++)
	// {
		 //finalstring=finalstring+s1.charAt(i);
		
		 
	// }
	 System.out.println(finalstring);
	
	}

}
