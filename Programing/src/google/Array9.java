package google;

public class Array9 {

	public static void main(String[] args) {
		int[][] arr=new int[3][2];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;
		arr[2][0]=5;
		arr[2][1]=6;
		for(int i=0;i<arr.length;i++)
		{
			int[] singlerow= arr[i];
			for(int j=0;j<singlerow.length;j++)
			{
				System.out.print(singlerow[j]+" ");
			}
			
			System.out.println();
		}

	}

}
