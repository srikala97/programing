package virtusa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.freecrm.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(3));
		//WebElement login= wait.until(ExpectedConditions.visibilityOfElementLocated((By.linkText("Log In"))));
		//login.click();
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.name("email")).sendKeys("srikalac@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Srikala");
		//driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(".ui.negative.message")).getText());
		
		
		
		
		
		
	}

}
