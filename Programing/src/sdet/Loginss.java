package sdet;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

	public class Loginss  {
	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
	        driver.get("https://www.freecrm.com/");
	        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(), 'Log In')]"));
	        loginButton.click();
	        WebElement usernameField = driver.findElement(By.name("email"));
	        WebElement passwordField = driver.findElement(By.name("password"));
	        WebElement loginSubmitButton = driver.findElement(By.xpath("//div[contains(text(), 'Login')]"));

	        usernameField.sendKeys("invalidUsername");
	        passwordField.sendKeys("invalidPassword");
	        loginSubmitButton.click();
	        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(), 'Invalid Login')]"));
	        if (errorMessage.isDisplayed()) {
	            System.out.println("Invalid error message is displayed.");
	        } else {
	            System.out.println("Invalid error message is not displayed.");
	        }
	        driver.quit();
	    }
	}


