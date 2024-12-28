
//Maximizing window and deleting All Cookies;
package actionDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Miscellaous {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        //Deleting All Cookies
        driver.manage().deleteAllCookies();
        //deleting Particular Cookie
       // driver.manage().deleteCookieNamed("abcdefg");
        driver.get("https://google.com");
        
        
	}

}
