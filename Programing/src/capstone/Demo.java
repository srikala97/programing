package capstone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	

	public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
	   //WebDriverWait wait = new WebDriverWait(driver,30);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement contactLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Contact")));
			   
	   contactLink.click();
	   driver.close();
        
       // driver.findElement(By.linkText("Contact")).click();
	
	}	
	
	
	
}
