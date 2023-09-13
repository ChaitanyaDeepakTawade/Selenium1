//package com.stepDefination;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DriverDataTable {
//	WebDriver driver = new ChromeDriver();
//	LoginPage objLoginPage;
//	@Given("Borwser open")
//	public void borwser_open() {
//	   
//		  driver.get("https://accounts.saucelabs.com/am/XUI/#login/");
//		
//	}
//	
//	@When("^user enters the credentials values$")
//	public void user_enters_the_credentials_values(io.cucumber.datatable.DataTable dataTable) throws Throwable {
//		//List<List<String>> credentialList = dataTable.transpose().cells(); //Transpose example.
//		List<List<String>> credentialList = dataTable.cells();
//		int rows = dataTable.height();
//		int col = dataTable.width();
//		 for (int i=0; i< rows ; i++) {
//			 driver= new ChromeDriver();
//			 driver.get("https://www.saucedemo.com/");
//		     driver.manage().window().maximize();
//		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		     objLoginPage = new LoginPage(driver);
//		     objLoginPage.setUsername(credentialList.get(i).get(0));
//		     objLoginPage.setPassword(credentialList.get(i).get(1));
//		     objLoginPage.login();
//		     driver.findElement(By.id("user-name")).sendKeys(credentialList.get(i).get(0));
//		     driver.findElement(By.id("password")).sendKeys(credentialList.get(i).get(1));
//		     driver.findElement(By.id("login-button")).click();
//		 }
//		}
//	
//		
//	@When("the user click And get admittedin to website")
//	public void the_user_click_and_get_admittedin_to_website() {
//		
//	}
//	
//	@Then("valididate successfully login")
//	public void valididate_successfully_login() {
//		
//	}
//	
//
//}
