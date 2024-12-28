package dec14;

import java.util.Scanner;

public class Prg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number...");
		int num=scan.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<num-2;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
				
			
		}
			
	}

}
