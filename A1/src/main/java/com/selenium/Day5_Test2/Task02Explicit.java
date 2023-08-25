package com.selenium.Day5_Test2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Synchronization problem USing Explicit Wait
 * @author Chaitanya Tawade (Expleo Pune).
 * @sign JDK-17 25/08/2023
 * */
public class Task02Explicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ctawade\\\\OneDrive - Expleo France\\\\Desktop\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\ctawade\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(co);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//Login Page
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"))).sendKeys("Admin");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"))).sendKeys("admin123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))).click();
	   
        //Admin Button selection
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Admin"))).click();
       
        //Search Admin 
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"))).sendKeys("Admin");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"))).click();
        
        //Logout 
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout"))).click();
        driver.quit();

	}

}
