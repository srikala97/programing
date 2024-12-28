package capstone;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo1 {
	
	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	       // WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout
	        WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.get("https://example.com");

	        // Wait for an element to be clickable
	        WebElement element = webdwait.until(ExpectedConditions.elementToBeClickable(By.id("exampleId")));

	        // Perform actions on the element
	        element.click();

	        // Rest of your automation code
	        driver.quit();
	    }
	}

	

