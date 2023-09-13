//package com.stepDefination;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
///*
// * @author Chaitnya Deepak Tawade (Expleo Pune)
// * @sign JDK-1.7 12/09/2023
// * */
//public class Test2 {
//	WebDriver driver;
//	
//	@Given("Browser Opens")
//	public void browser_opens() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver= new ChromeDriver();
//	}
//
//	@Before("@tag1 or @tag2")
//	public void before() {
//		System.out.println("tag1 ---------------------");
//	}
//	
//	@When("open google.com")
//	public void when() {
//		
//		driver.get("https:\\google.com");
//		
//	}
//	@Then("validate google page title.")
//    public void then() {
//		Assert.assertEquals(driver.getTitle(), "Google");
//		
//	}
//}
