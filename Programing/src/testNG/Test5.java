package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Test5 {
	
	@BeforeClass
	public void test1()
		{
			System.out.println("Test1.....");	
		}
	
     @AfterClass
	public void test2()
	{
		System.out.println("Test2.....");	
	}
	@BeforeMethod
	public void test3()
	{
		System.out.println("Test3.....");	
	}
	
	@AfterMethod
	public void test4()
	{
		System.out.println("Test4.....");	
	}
	
	
	
	
}
