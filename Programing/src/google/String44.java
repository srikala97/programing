package google;

import java.util.Scanner;

public class String44 {
	
	

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println(" Enter a sentence...");
    String s1=scan.nextLine();
    String[] sarr=s1.split(" ");
   // String words="";
    String sentence="";
    for(int i=0;i<=sarr.length-1;i++)
    {
    	String word=sarr[i];
    	String words="";
    	for(int j=word.length()-1;j>=0;j--)
    	{
    		
    		words=words+word.charAt(j);
    	}
    	
    	sentence=sentence+words+" ";
    }
    
		
	System.out.print(sentence);	
		
	}

}
