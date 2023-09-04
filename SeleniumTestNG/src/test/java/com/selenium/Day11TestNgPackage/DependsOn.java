package com.selenium.Day11TestNgPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOn {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("Depends On");
  }
  @BeforeClass
  public void beforeClass112() {
	  System.out.println("Welcome Depends");
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
	  
	  System.out.println("After Class ");
  }
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Before Suite");
  }
}
