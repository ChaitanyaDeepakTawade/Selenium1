package com.selenium.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ctawade\\OneDrive - Expleo France\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("---remote.allow-origins-*");
		co.setBinary("C:\\Users\\ctawade\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		long start = System.currentTimeMillis();
		ChromeDriver driver = new ChromeDriver(co);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		//.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		WebElement searchBox = driver.findElement(By.name("q"));
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(searchBox));
		searchBox.sendKeys("Google");
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for page load - "+totalTime +"millis"); 
		
		
	}

}
