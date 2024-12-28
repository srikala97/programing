package google;

import java.util.Scanner;

public class String34 {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println(" enter the sentence...");
      String s1=scan.nextLine();
      System.out.println(" enter the start index...");
      int start=scan.nextInt();
      String finalstring="";
      for(int i=start;i<s1.length();i++)
      {
    	  finalstring=finalstring+s1.charAt(i);
      }
      System.out.println(finalstring);
		
		
		
		
	}

}
