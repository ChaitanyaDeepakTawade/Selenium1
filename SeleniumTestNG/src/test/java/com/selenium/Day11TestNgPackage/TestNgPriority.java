package com.selenium.Day11TestNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNgPriority {
	 @Test (priority = 2)
	  public void f() {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://google.com");
		  driver.manage().window().maximize();
	  }
	  @Test (priority = 1)
	  public void g() {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://bing.com");
		  driver.manage().window().maximize();
	  }
}
