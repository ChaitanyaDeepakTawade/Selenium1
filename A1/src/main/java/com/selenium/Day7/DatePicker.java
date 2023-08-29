package com.selenium.Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * Simple code for input type Date data send.
 * @author Chaitanya Deepak Tawade (expleo pune).
 * @sign JDK 1.7 29/08/2023 
 * */
public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//enter source location
		WebElement srcElement=driver.findElement(By.id("source"));
		srcElement.sendKeys("Pune",Keys.ENTER);
		WebElement dstElement=driver.findElement(By.id("destination"));
		dstElement.sendKeys("Mumbai",Keys.ENTER);
		Thread.sleep(1000);
		WebElement datepicker=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].setAttribute('value','01/10/2023')", datepicker);
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
	}

}
