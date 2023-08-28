package com.selenium.Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EventActions {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Actions actions= new Actions(driver);
		WebElement navElement=driver.findElement(By.xpath("//*[@id=\"product-menu-toggle\"]"));
		//actions.moveToElement(navElement).perform();
		//actions.contextClick(navElement).perform();
		actions.doubleClick(driver.findElement(By.tagName("h1"))).perform();
		
		
	}

}
