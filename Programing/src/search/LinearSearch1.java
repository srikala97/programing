package search;

import java.util.Scanner;

public class LinearSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the size .....");
        int size=scan.nextInt()	;
        System.out.println(" enter the "+size+" elements....");
        int[] ele=new int[size];
        for(int i=0;i<ele.length-1;i++)
        {
        	ele[i]=scan.nextInt();
        }
        System.out.println(" enter the search element....");
        int search=scan.nextInt();
        boolean flag=false;
        for(int i=0;i<ele.length;i++)
        {
        	
           if(search==ele[i])
        		{
        			System.out.println(" element found....");
        			flag=true;
        			break;
        		}
        			
        }
        if(flag==false)
        {
        	
        	System.out.println(" element not found....");
        }
        
		
		
		
		
	}

}
