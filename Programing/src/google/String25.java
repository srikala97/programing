package google;

import java.util.Scanner;

public class String25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the sentence..");
      String sentence=scan.nextLine();
      String sarr[]=sentence.split(" "); 
      String rev="";
      for(int i=sarr.length;i>=0;i--)
      {
    	  String word=sarr[i];
    	
    	  String words="";
    	  for(int j=word.length()-1;j>=0;j--)
    	  {
    		  char c=word.charAt(j);
    		  words=words+c;
    		  
    	  }
    	  rev=rev+words+" ";
    	  
      }
      
		System.out.println(rev);
		
		
		
		
	}

}
