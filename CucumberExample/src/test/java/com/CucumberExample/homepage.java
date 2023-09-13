package com.CucumberExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/*
 * @author Chaitnya Deepak Tawade (Expleo Pune)
 * @sign JDK-1.7 12/09/2023
 * */
public class homepage {
	WebDriver driver;

//	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/form/div/div[2]/div[1]/div/span[1]")
//	static WebElement iPhonePrice1;

	By iPhonePrice1=By.xpath("//*[@id=\"content\"]/div[2]/div[2]/form/div/div[2]/div[1]/div/span[1]");
	By iPhone = By.xpath("//img[@title='iPhone']");

	public homepage(WebDriver driver) {
		this.driver=driver;
		iPhonePrice1Check();
	}

	public void iPhonePrice1Check() {
		driver.findElement(iPhonePrice1).getText();
	}

	public void clickiPhonee() {
		driver.findElement(iPhone).click();
	}

 

//	@FindBy(partialLinkText = "iPhone")
//	static WebElement iPhonee;


}
