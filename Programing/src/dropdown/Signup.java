package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		//driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srikala@gmail.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//body")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='ui negative message'])")).getText());
		
		
		
		
		
	}

}
