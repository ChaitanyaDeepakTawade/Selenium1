package com.Day18_13092023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiScenerio {
	WebDriver driver;
	
	@Given("open google browser")
	public void open_google_browser() {
		    driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		   
	}

	@When("Enter {string} and {string}")
	public void enter_username_and_password(String username, String password) {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
	@Then("Assert Login Page")
	public void assert_login_page() {
	   
	}

	

}
