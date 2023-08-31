package com.selenium.Day8_Test;

import java.time.Duration;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Q4 : test Login page
 * @author Chaitanya Tawade (Expleo Pune).
 * @sign JDK-17 25/08/2023
 * */
public class LoginPage{
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 //Creating Object of ChromeDriver
		 WebDriver driver= new ChromeDriver();
		 //Create wait object
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 
		 //1. Open the Page: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 //2. Maximize the Screen
		 driver.manage().window().maximize();
		 
 		 //3. Enter the Username and Password
 		 wait.until(ExpectedConditions.elementToBeClickable(By.name("username"))).sendKeys("Admin");  //input box username
         wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("admin123"); //input box Password
         
         //4. Click Login Button
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
 	   
         Thread.sleep(2000);
         //5. Click on the Profile
         wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-userdropdown-tab"))).click();
         Thread.sleep(2000);
         //6. Click on LogOut
         driver.findElement(By.linkText("Logout")).click();
         
         //7. Verify the User Returns into the Login Page
         if( driver.getPageSource().equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
         {
        	 System.out.println("Verified .  Your Successfully Log Out.");
         }
        
         driver.quit();

    }

}
