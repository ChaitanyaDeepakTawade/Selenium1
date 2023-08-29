package com.selenium.Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * simple code select option.
 * @author chaitanya tawade(Expleo Pune).
 * @sign jdk 1.7 29/08/2023.
 * */
public class DropDownSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Select selects=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		selects.selectByIndex(1);
		Thread.sleep(5000);
		selects.deselectByIndex(1);
		
		selects.selectByVisibleText("Price (High > Low)");
		

	}

}
