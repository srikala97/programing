package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"sri","kala","shailu","srikanth"};
		for(String value:arr)
		{
			System.out.println(value);
		}
		
		//Storing of array into arraylist.......
		
		ArrayList a1=new ArrayList(Arrays.asList(arr));
		System.out.println(a1);
		
		
		
	}

}
