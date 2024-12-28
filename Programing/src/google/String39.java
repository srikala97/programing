package google;

import java.util.Scanner;

public class String39 {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter a string....");
      String s1=scan.next();
      String temp;
      int add=0;
      for(int i=0;i<=s1.length()-1;i++)
      {
    	  char c=s1.charAt(i);
    	  if(Character.isDigit(c))
    	  {
    		  
    		 temp=c+"";
    		 int k=Integer.parseInt(temp);
    		 add=add+k;
    		
    	  }
    	  
      }
      
		System.out.println(add);
		
	}

}
