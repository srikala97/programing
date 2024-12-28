package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class HandleDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement courseName= driver.findElement(By.id("ide"));
		Select options1= new Select(courseName);
		List<WebElement> allOptions = options1.getOptions();
		for(WebElement allcourse : allOptions)
		{
			System.out.println(allcourse.getText());
		}
		
		options1.selectByIndex(0);
		Thread.sleep(3000);
		options1.selectByValue("nb");
		Thread.sleep(3000);
		options1.selectByIndex(1);
		Thread.sleep(3000);
		options1.deselectByVisibleText("NetBeans");
		List<WebElement> selectedOptions = options1.getAllSelectedOptions();
		for(WebElement selected : selectedOptions)
		{
			System.out.println(selected.getText());
		}
		
		
		
		
		
		/*WebElement courseName= driver.findElement(By.id("course"));
		Select options1= new Select(courseName);
		List<WebElement> allOptions = options1.getOptions();
		for(WebElement allcourse : allOptions)
		{
			System.out.println(allcourse.getText());
		}
		options1.selectByIndex(0);
		Thread.sleep(3000);
		options1.selectByValue("python");
		Thread.sleep(3000);
	     options1.selectByVisibleText("Javascript");
	    String frstoptions= options1.getFirstSelectedOption().getText();
		System.out.println("First selected options... "+frstoptions);
		*/
		
		
		
		
	}

}
