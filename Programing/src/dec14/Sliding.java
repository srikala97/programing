package dec14;

public class Sliding {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Sliding slide=new Sliding();
		long result=slide.subsum(new int[] {2,5,6,7,8,3,1}, 3);
		
		System.out.println(result);
		
	}	
		
	long subsum(int[] ar,int k)
	{	
		int n=ar.length;
		long max=Integer.MIN_VALUE;
		long sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+ar[i];
		}
		
		max=Math.max(sum, max);
		
		int s=1,e=k;
		while(e<n)
		{
			sum=sum-ar[s-1]+ar[e];
			max=Math.max(sum, max);
			s++; e++;
		}
		return max;
		
	}
	

}
