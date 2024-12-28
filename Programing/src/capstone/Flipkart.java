package capstone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver=new ChromeDriver(options);
	//	WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(1));
       // WebElement firstItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s1Q9rs a")));

	//	WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.className("_30XB9F")).click();
		//WebElement Search= driver.findElement(By.className("Pke_EE"));
		 WebElement searchBox = driver.findElement(By.name("q"));
		 searchBox.sendKeys("iphone14");
		 searchBox.sendKeys(Keys.RETURN);
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		 List<WebElement> itemsCount = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".s1Q9rs")));
		// int itemsCount = driver.findElements(By.cssSelector(".s1Q9rs")).size();
	        System.out.println("Number of items displayed: " + itemsCount);
	      
	       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        // Wait for the first displayed search item
	        WebElement firstItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s1Q9rs a")));
	        firstItem.click();

	      
	        
		/*
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(20));
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("_1YokD2")));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("_1YokD2")));
		java.util.List<WebElement> searchResults = driver.findElements(By.className("_1YokD2"));
        int numberOfItemsDisplayed = searchResults.size();
        System.out.println("Number of items displayed: " + numberOfItemsDisplayed);
        searchResults.get(0).click();
        String expectedTitle = "Expected Title of the Page"; // Replace with the expected title
        wait.until(ExpectedConditions.titleContains(expectedTitle));
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Navigated to the right page with the expected title: " + actualTitle);
        } else {
            System.out.println("Page navigation or title verification failed. Actual title: " + actualTitle);
        }
        
   */     
        
driver.close();
		
		//driver.findElement(By.className("_1YokD2"));
		/*Thread.sleep(2000);
		driver.findElement(By.className("_18u87m")).sendKeys("9848656742");
		driver.findElement(By.className("_1wGnMD")).click();
		driver.findElement(By.name("q")).sendKeys("iphone14");
		//driver.findElement(By.)
		
		
		//WebElement phonenumber=driver.findElement(By.className("_2IX_2-"));
				//phonenumber.sendKeys("9821876543");
		/*WebElement loginButton=driver.findElement(By.xpath());
		loginButton.click();
		
		WebElement phonenumber=driver.findElement(By.xpath());
		phonenumber.sendKeys("9821876543");
		
		WebElement requestOTP=driver.findElement(By.xpath());
		requestOTP.click();
		Thread.sleep(4000);
		WebElement Popup=driver.findElement(By.xpath());
		if(Popup.isDisplayed())
		{
			System.out.println("The message is displayed in the popup");
		}
		else
		{
			System.out.println("The message is not displayed in the popup");
		}
		
		*/
		
		
		
		
		
		
		
		
		
		/*WebElement element = webdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("_2hriZF _2rbIyg")));
		element.click();
		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		loginButton.click();
		/*try
		{
			WebElement loginPopup = driver.findElement(By.xpath("//div[@class='_3Njdz7']"));

		if (loginPopup.isDisplayed()) {
            // Find the username and password fields and enter your credentials
            WebElement usernameField = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
            WebElement passwordField = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
            
            usernameField.sendKeys("your_username");
            passwordField.sendKeys("your_password");
            
            WebElement loginButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
            loginButton.click();
        }
    } catch (Exception e) {
        // If no login pop-up is found, continue with your normal operations
        System.out.println("No login pop-up found.");
    }
		
	*/	//driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		/*WebElement iframeElement = driver.findElement(By.id("iframeId")); 
		driver.switchTo().frame(iframeElement);
		WebElement flipkartLogo = driver.findElement(By.cssSelector("div._1QrSmo > a"));
        if (flipkartLogo.isDisplayed() && flipkartLogo.getText().equals("Flipkart")) {
            System.out.println("Flipkart logo is present on the left side of the top bar.");
        } else {
            System.out.println("Flipkart logo is not found on the left side of the top bar.");
        }
		
		*/
		
		
		
	}

}
