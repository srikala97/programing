package search;

import java.util.Arrays;

public class Insertionsort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5,4,10,1,6,2};
		System.out.println(" Arrays befor sorting...."+Arrays.toString(arr));
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+",");
		}
		*/
	
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while((j>=0)&&(arr[j]>temp))
			{
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=temp;
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
