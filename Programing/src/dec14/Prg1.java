package dec14;

public class Prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Sliding window program ...
		
		int arr[] = {1,3,5,6};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
			
		}
		
		
		
		
	}

}
