package scenario2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	protected WebDriver driver;
    protected ContactPage contactPage;

    @BeforeClass
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(options);

        // Initialize Page Objects
        contactPage = new ContactPage(driver);

        // Maximize the browser window (optional)
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver
        driver.quit();
    }
	
	
}
