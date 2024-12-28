package actionDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("Srikala");
		driver.findElement(By.name("inputPassword")).sendKeys("Srikala@09");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Srikalasri");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("srikala@gmail.com");
		//driver.close();
		//driver.findElement(By.cssSelector("//input[@type='text'][3]")).sendKeys("9921");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']"));
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
		
		

	}

}
