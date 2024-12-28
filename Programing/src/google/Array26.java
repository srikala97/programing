package google;

import java.util.Scanner;

public class Array26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println(" enter the size...");
      int size=scan.nextInt();
      System.out.println(" Enter the "+ size+" elements...");
      int[] arr=new int[size];
     // System.out.println(" Enter the array element...");
      //int element=scan.nextInt();
      int count=0;
      for(int i=0;i<arr.length;i++)
      {
    	  arr[i]=scan.nextInt();
      }
      System.out.println(" Enter the array element...");
      int element=scan.nextInt();
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]==element)
    	  {
    		  count++;
    	  }
    	  
      }
		
	System.out.println(" occurance of an element...."+count);	
		
	}

}
