package com.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/*
 * @author Chaitnya Deepak Tawade (Expleo Pune)
 * @sign JDK-1.7 12/09/2023
 * */
public class Test1 {
	 WebDriver driver = new ChromeDriver();

	 @Given("Open the URL")
	 public void open_the_url() {

		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}

//   	@When("Enter {string} and {string}")
		@When("Enter (.*) and (.*)$")
		public void user_provides_username_and_password(String username, String password) {
//			WebDriver driver = new ChromeDriver();
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		}




	@When("Click Login button")
	public void click_login_button() {
//			WebDriver driver = new ChromeDriver();

		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

	 

	@Then("Assert Login or not")
	public void assert_login_or_not()  throws InterruptedException {
//			WebDriver driver = new ChromeDriver();
			Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			Thread.sleep(3000);
			driver.quit();
		}

	 

	}

