package com.selenium.Day11TestNgPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertExample {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https:\\google.com");
	  driver.findElement(By.name("q")).sendKeys("Chaitanya tawade "+Keys.ENTER);
	  Assert.assertNotEquals(driver.getTitle(),"Google");
	  Assert.assertEquals(driver.getTitle(),"Google");
  }
}
