package google;

import java.util.Scanner;

public class String48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println(" Enter a sentence...");
       String s1=scan.nextLine();
       String[] sarr=s1.split(" ");
       int big=sarr[0].length();
       for(int i=1;i<=sarr.length;i++)
       {
    	   if(sarr[i].length()>big)
    	   {
    		   big=sarr[i].length();
    	   }
    	   System.out.println(big);
       }
       
		
		
		
	}

}
