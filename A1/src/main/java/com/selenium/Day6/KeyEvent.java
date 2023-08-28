package com.selenium.Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyEvent {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Actions actions=new Actions(driver);
		WebElement textbox= driver.findElement(By.name("q"));
		actions.keyDown(Keys.SHIFT);
		actions.sendKeys("hello").keyUp(Keys.SHIFT).sendKeys(" hello").build().perform();
	}

}
