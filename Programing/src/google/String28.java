package google;

import java.util.Scanner;

public class String28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println(" Enter the sentence..");
      String s1=scan.next();
      String[] sarr1=s1.split("");
      int sarr2= sarr1[0].length();
      for(int i=1;i<sarr1.length;i++)
      {
    	  int tempbig=sarr1[i].length();
    	  
    	  if(tempbig>sarr2)
    	  {
    		  
    	  }
    	  
    	  
      }
    	
		
	}

}
