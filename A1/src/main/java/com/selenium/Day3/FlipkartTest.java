package com.selenium.Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

/*
 * code for search samsung mobile from flipkart
 * @author chaitanya tawade(Expleo pune).
 * @sign JDK 1.7 23/08/2023.
 * 
 * */

public class FlipkartTest {
    public static void main(String[] args) throws Exception {
        // driver setup
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ctawade\\OneDrive - Expleo France\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("---remote.allow-origins-*");
		co.setBinary("C:\\Users\\ctawade\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver=new ChromeDriver(co);
        //chrome driver object
       // WebDriverDecorator driver = new WebDriverDecorator(co);
        driver.get("https://www.flipkart.com");
        //search google in search bar
        Thread.sleep(3000);
        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
        driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
//        WebElement samsung = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]"));
//
//        samsung.click();
   
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label")).click();
        Thread.sleep(5000);

        List<WebElement> data=driver.findElements(By.className("_4rR01T"));

        for(WebElement i : data) {

            System.out.println(i.getText());

        }

        //Scroling '
        
        JavascriptExecutor jss = (JavascriptExecutor) driver;

        jss.executeScript("window.scrollBy(0,3000)", "");
        
        
        
        
        Thread.sleep(60000);

        driver.quit();
        
    }

}
