package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe" );
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.freecrm.com");
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srikala@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		WebElement errorMessage=driver.findElement(By.xpath("//ul[@class='list']"));
		String actualErrorMessage=errorMessage.getText();
		String expectedErrorMessage="Please accept the terms to continue";
		if(actualErrorMessage.equals(expectedErrorMessage))
		{
			System.out.println("success.... ");
		}
		else
		{
			System.out.println("Failure...");

		}
		
		//Close the Browser
		driver.quit();	
	}
}
