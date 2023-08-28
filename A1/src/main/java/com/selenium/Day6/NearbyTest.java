package com.selenium.Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NearbyTest {
	public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SeleniumButton= driver.findElement(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));
       
//		WebElement buttonElement =driver.findElement(RelativeLocator.with(By.tagName("img"))
//              	.toLeftOf(SeleniumButton));
//		buttonElement.click();	
//		WebElement buttonElement2 =driver.findElement(RelativeLocator.with(By.tagName("img"))
//              	.toRightOf(SeleniumButton));
//		buttonElement2.click();
//		Thread.sleep(5000);

		WebElement buttonElement3 =driver.findElement(RelativeLocator.with(By.tagName("img"))
              	.near(SeleniumButton));
		buttonElement3.click();	
		
		
	}

}
