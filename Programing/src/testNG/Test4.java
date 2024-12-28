package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {

	// TODO Auto-generated method stub

		@BeforeTest
		public void beforeTestSetup()
		{
			System.out.println("Before Test...");
		}
		@AfterTest
		public void AfterTestSetup()
		{
			System.out.println("After Test...");
		}
		@BeforeClass
		public void BeforeclassSetup()
		{
			System.out.println("Beforeclass...");
		}
		@AfterClass
		public void AfterclassSetup()
		{
			System.out.println("After Class...");
		}
		@BeforeMethod
		public void BeforeMethodSetup()
		{
			System.out.println("BeforeMethod...");
		}
		@AfterMethod
		public void AfterMethodSetup()
		{
			System.out.println("AfterMethod...");
		}
		
		@Test
		public void TestSetup()
		{
			System.out.println("Test....");
		}
		
		
		
		
		
		
		
		
		
		
}

