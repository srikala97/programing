package javaPrograms;

public class Static_Nonstatic {


	static int a=20;
	int b=15;
	public static void main(String[] args) {
		
		//static int a=20;
		//int b=15;
		System.out.println("Main Starts.....");
		System.out.println(a);
		Static_Nonstatic s1=new Static_Nonstatic();
		Static_Nonstatic s2=new Static_Nonstatic();
		Static_Nonstatic s3=new Static_Nonstatic();
		System.out.println(s1.b);
		System.out.println(s2.b);
		System.out.println(s3.b);
		System.out.println("Main Ends......");
		
		
		
		
		
		
		
		
		
		

	}

}
