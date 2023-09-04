package com.selenium.Day11TestNgPackage;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupExample {
	WebDriver driver;
  @Test (groups = "google")
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("https://google.com");
	  driver.manage().window().maximize();
  }
  @Test (groups = "google")
  public void g() {
	  driver.findElement(By.name("q1.;"));
  }
  @Test (groups = "google")
  public void h() {
	  driver.findElement(By.name("q")).sendKeys("Chaitanya Tawade");;
  }
  @Test (groups = "bing")
  public void i() {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("https://bing.com");
	  driver.manage().window().maximize();
  }
}
