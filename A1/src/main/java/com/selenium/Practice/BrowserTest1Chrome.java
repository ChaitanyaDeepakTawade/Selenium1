package com.selenium.Practice;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserTest1Chrome {
	
	public static void main(String args[]) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ctawade\\OneDrive - Expleo France\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("---remote.allow-origins-*");
		co.setBinary("C:\\Users\\ctawade\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
//		WebElement searchBox = driver.findElement(By.name("q"));
//		
//		//searchBox.sendKeys("Google",Keys.ENTER);
//		searchBox.sendKeys("Google");
//		Thread.sleep(3000);
//		String atString= searchBox.getAttribute("value");
//		System.out.println(atString);
//		atString= searchBox.getTagName();
//		System.out.println(atString);
		
		/*-------------------------------- X Path --------------------------------------------*/
//		WebElement searchBox2 = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));//relative xpath (flipcart dynamical pages changes div changes depends on cookies .
//		searchBox2.sendKeys("Relative X Path");
//		Thread.sleep(1000);
//		searchBox2.clear();
		//custom made path using web inspector control + f.
		WebElement searchBox4 = driver.findElement(By.xpath("//textarea[starts-with(@id,'A')]"));//relative xpath (flipcart dynamical pages changes div changes depends on cookies .
		searchBox4.sendKeys("Relative X Path");
		Thread.sleep(1000);
		searchBox4.clear();
		//absolute XPath
		
		WebElement searchBox3 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
		searchBox3.sendKeys("Full X Path");
		searchBox3.submit();
		System.out.println(searchBox3);
		
//		
//		
//		searchBox.clear();
//		
//		WebElement gmailButton = driver.findElement(By.linkText("Gmail")); //its for text have link.
//		boolean status =gmailButton.isEnabled(); 
//		System.out.println(status);
//		status =gmailButton.isDisplayed(); 
//		System.out.println(status);
		
		
//		gmailButton.click();
		
//	    driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.mozilla.org/en-US/firefox/new//");
//    	driver.switchTo().newWindow(WindowType.TAB);
//		
//		driver.get("https://hourglass.in.expleogroup.com/");
//		driver.quit();
		

		
	}

}