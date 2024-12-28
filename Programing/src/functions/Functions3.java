package functions;

public class Functions3 {

	
  static int addnumbers(int...numbers)
	{
		int sum=0;
		/*for(int i=0;i<numbers.length;i++)
		{
			sum=sum+numbers[i];
		}
		return sum; */
		
		
		
		for(int num:numbers)
		{
			sum=sum+num;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args)
	{
		
		
		System.out.println(addnumbers(1,2,3,4));
		
		
	}
	
	
	
}
