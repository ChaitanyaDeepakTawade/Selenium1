package com.CucumberExample;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
 
	WebDriver driver;
	homepage objhomepage;
	IphonePage objIphonePage;
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	
	}
@Test
public void f() throws InterruptedException {

	  objhomepage=new homepage(driver);
	  Thread.sleep(3000);
	  objhomepage.clickiPhonee();
//	  Assert.assertEquals(objhomepage.iPhonePrice1,objIphonePage.iPhonePrice2);
}
}
