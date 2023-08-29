package com.selenium.Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Simple code for access iframe elements from web page.
 * @author Chaitanya Deepak Tawade (expleo pune).
 * @sign JDK 1.7 29/08/2023 
 * */
public class Frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame(2);
		WebElement textElement = driver.findElement(By.tagName("h1"));
		System.out.println(textElement.getText());
		driver.switchTo().defaultContent();
		
		
	}

}
