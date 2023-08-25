package com.selenium.Day5_Test2;

import java.time.Duration;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * Synchronization problem USing Implicit Wait
 * @author Chaitanya Tawade (Expleo Pune).
 * @sign JDK-17 25/08/2023
 * */
public class Task01Implicit {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ctawade\\\\OneDrive - Expleo France\\\\Desktop\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
         ChromeOptions co = new ChromeOptions();
         //Browser Setup
 		 co.setBinary("C:\\Users\\ctawade\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
         WebDriver driver = new ChromeDriver(co);
         driver.manage().window().maximize();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin",Keys.TAB);
         driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
         driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
         driver.findElement(By.linkText("Logout")).click();
         String s = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")).getText();
         System.out.println(s.equals("Login")?"Pass":"Fail");
         driver.quit();

    }

}
