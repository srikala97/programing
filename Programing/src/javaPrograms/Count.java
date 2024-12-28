

//write a program to count numbers from 1 to 100 which are divisble by 4...
package javaPrograms;

public class Count {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		int count=0;
      for(int i=1;i<=100;i++)
      {
    	  if(i%4==0)
    	  {
    		  count++;
    	
    	  }
    	  //System.out.println(count);
      }
		
		System.out.println(count);
		
		
	}

}
