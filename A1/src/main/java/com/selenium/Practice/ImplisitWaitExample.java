package com.selenium.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplisitWaitExample {
	public static void main(String args[])
	{

		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ctawade\\OneDrive - Expleo France\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("---remote.allow-origins-*");
		co.setBinary("C:\\Users\\ctawade\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		long start = System.currentTimeMillis();
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		//ChromeDriver driver2=new ChromeDriver(co);
		//driver2.get("https://www.google.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    
		WebElement searchBox = driver.findElement(By.name("q"));
	    
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for page load - "+totalTime +"millis"); 
		//searchBox.sendKeys("Google",Keys.ENTER);
		searchBox.sendKeys("Google");
	}

}
