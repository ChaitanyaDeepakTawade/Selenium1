package com.selenium.test1;

import java.awt.desktop.AboutEvent;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/*
 * Testing Contact us form .
 * @author chaitanya tawade(Expleo pune).
 * @sign JDK 1.7 23/08/2023. 
 * */
public class TestCase3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ctawade\\OneDrive - Expleo France\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cOptions=new ChromeOptions();
		cOptions.setBinary("C:\\\\Users\\\\ctawade\\\\Downloads\\\\chrome-win64\\\\chrome-win64\\\\chrome.exe");
		ChromeDriver driver=new ChromeDriver(cOptions);
		driver.get("https://www.saucedemo.com/");
		//maximise page
		driver.manage().window().maximize();
		//login page 
		WebElement userName=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		userName.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//Side nav bar Button click
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(1000);
		//About page 
	    WebElement About =driver.findElement(By.linkText("About"));
	    About.click();
	    // Contact link click 
	    Thread.sleep(1000);
		WebElement Contact=driver.findElement(By.linkText("Contact us"));
		Contact.click();
		
        // Contact form fill  
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("FirstNameTest");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("LastNameTest");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("example@company.com");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("Sample Company");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("0123456789");
		 Thread.sleep(1000);
		 Select drpCountry = new Select(driver.findElement(By.xpath("//*[@id=\"Country\"]")));
		 drpCountry.selectByVisibleText("India");
		 
		 Thread.sleep(1000);
		 Select drpIntrest = new Select(driver.findElement(By.xpath("//*[@id=\"Solution_Interest__c\"]")));
		 drpIntrest.selectByVisibleText("Sauce Error Reporting");
		 Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//*[@id=\"Sales_Contact_Comments__c\"]")).sendKeys("Example comment");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"mktoCheckbox_38184_0\"]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"mktoForm_3124\"]/div[22]/span/button")).submit();
	}

}
