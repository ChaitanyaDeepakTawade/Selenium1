package com.stepDefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
	WebDriver driver;
	By Username = By.id("user-name");
	By Password = By.id("password");
	By login = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
	
		this.driver=driver;
	
	}
	
	public void setUsername(String string) {
		
		driver.findElement(Username).sendKeys("Admin");
	
	}
	
	public void setPassword(String string) {
		
		driver.findElement(Password).sendKeys("Admin123");
	
	}
	
    public void login() {
		
		driver.findElement(login).click();
	
	}
	
	
}
