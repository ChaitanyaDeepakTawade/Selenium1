package com.selenium.Day11TestNgPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnExample {
	WebDriver driver;
	 @Test 
	  public void f() {
		  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
		  driver.get("https://google.com");
		  driver.manage().window().maximize();
	  }
	  @Test (dependsOnMethods = {"f"})
	  public void g() {
		  driver.findElement(By.name("q1.;"));
	  }
	  @Test (dependsOnMethods = {"f","g"})
	  public void h() {
		  driver.findElement(By.name("q")).sendKeys("Chaitanya Tawade");;
	  }
	  @Test 
	  public void i() {
		  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
		  driver.get("https://bing.com");
		  driver.manage().window().maximize();
	  }
}
