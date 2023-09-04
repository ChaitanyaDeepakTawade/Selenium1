package com.selenium.Day11TestNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationExample1 {

	  WebDriver driver;
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://google.com");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void go() {
	  driver = new ChromeDriver();
	  driver.get("https://bing.com");
	  driver.manage().window().maximize();
  }
  
  @BeforeClass
  public void beforeClass112() {
	  System.out.println("Welcome 134526");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  System.out.println("Before Method");
	  
  }  
  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After Class");
  }
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Before Suite");
  }
}
