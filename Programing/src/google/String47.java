package google;

import java.util.Scanner;

public class String47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println(" Enter a sentence....");
      String s1=scan.nextLine();
      String[] sarr=s1.split(" ");
      for(int i=sarr.length-1;i>=0;i--)
      {
    	  String word=sarr[i];
    	  String sentence="";
    	  for(int j=word.length()-1;j>=0;j--)
    	  {
    		  sentence=sentence+word.charAt(j);
    		  
    	  }
    	  System.out.print(sentence+" ");
      }
      
      
		
		
		
		
	}

}
