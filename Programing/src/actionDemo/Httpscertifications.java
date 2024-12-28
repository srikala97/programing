package actionDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Httpscertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
		
	}

}
