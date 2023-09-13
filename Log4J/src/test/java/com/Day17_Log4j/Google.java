package com.Day17_Log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;
	Logger log;

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}
	@Test
	public void f() {

		log = LogManager.getLogger(Google.class);
		driver.get("https://google.com");
		log.info("------------Openeing Google----------------");

		String txt;
		try {
			txt = driver.getTitle();
			System.out.println(txt);
			Assert.assertEquals(txt, "Google");
		} 
		catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Element Not Found");
		}

	}
}
