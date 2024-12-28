package google;

import java.util.Scanner;

public class String37 {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println(" Enter a string...");
       String s1=scan.next();
      // String s2="";
       char[] c1=s1.toCharArray();
       for(int i=c1.length-1;i>=0;i--)
       {
    	  
    	   System.out.print(c1[i]);
       }
		
		
		
	}

}
