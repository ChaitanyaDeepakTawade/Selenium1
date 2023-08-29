package com.selenium.Day7;

import java.time.Duration;

import org.bouncycastle.oer.its.ieee1609dot2dot1.ButterflyExpansion;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * Simple code for Alert Box .
 * @author Chaitanya Deepak Tawade (expleo pune).
 * @sign JDK 1.7 29/08/2023 
 * */
public class AlertOperation {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement textBox = driver.findElement(By.name("cusid"));
        textBox.sendKeys("1");
        WebElement submit= driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(2000);
		Alert a2 = driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
