package dec14;

public class Prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sliding window: Highest sum of subarry of lenght 3 in below array: [59187]
		
		int arr[]= {5,9,1,8,7};
		//int temp=0;
		int len=3;
		int sum=0;
		for(int i=0;i<=arr.length-3;i++)
		{
			int j=i+len-1;
			int temp=0;
				for(int k=i;k<=j;k++)
				{
					
					temp+=arr[k];
					System.out.print(temp);
					
				}
				
				sum=Math.max(sum, temp);
				
			}
		System.out.println(sum);
		}
		
		
		
	}


