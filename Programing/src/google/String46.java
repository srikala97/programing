package google;

import java.util.Scanner;

public class String46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println(" Enter the sentence....");
      String s1=scan.nextLine();
      String[] sarr=s1.split(" ");
      String s2="";
      for(int i=0;i<=sarr.length-1;i++)
      {
    	  s2=sarr[i];
    	  String word="";
    	  for(int j=s2.length()-1;j>=0;j--)
    	  {
    		  word=word+s2.charAt(j);
    		  
    	  }
    	  System.out.print(word+" ");
      }
		
		
		
		
	}

}
