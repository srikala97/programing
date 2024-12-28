package google;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size...");
        int size=scan.nextInt();
        System.out.println("enter"+size+"elements...");
        int[] elements=new int[size];
        for(int i=0;i<=elements.length-1;i++)
        {
        	elements[i]=scan.nextInt();
        }
        for(int i=0;i<=elements.length-1;i++)
        {
        	if(i%2==0)
        	{
        		System.out.println(elements[i]);
        	}
        }
        
		
		
		
		
		
		
		
	}

}
