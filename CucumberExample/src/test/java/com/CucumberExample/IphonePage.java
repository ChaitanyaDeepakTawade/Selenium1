package com.CucumberExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IphonePage {
	WebDriver driver;

//	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/ul[2]/li[1]/h2/span")
//	static WebElement iPhonePrice2;

	By iPhonePrice2=By.xpath("//*[@id=\\\"content\\\"]/div[1]/div[2]/ul[2]/li[1]/h2/span");

 

public IphonePage(WebDriver driver) {
	this.driver=driver;
}

 

public void iPhonePrice() {
	driver.findElement(iPhonePrice2).getText();
}

}
