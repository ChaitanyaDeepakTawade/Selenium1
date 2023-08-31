package com.selenium.Day8_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Q2 : Test smart hospital website.
 * @author Chaitanya Deepak Tawade(Expleo Pune)
 * @sign jdk-1.7 30/08/2023
 * */

public class SmartHospital {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//Creating Object of ChromeDriver
		WebDriver driver= new ChromeDriver();
		
		//1. Open the Page: https://demo.smart-hospital.in/site/login
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        //2. Click on the Pathologist and click Sign In
       
        driver.findElement(By.linkText("Pathologist")).click();         //pathelogist button click
       
        driver.findElement(By.xpath("//button[@type='submit']")).click(); //sign in button click
        
        //3. Click on Messaging and then click on Post New Message
        
        driver.findElement(By.linkText("Messaging")).click();            //Messaging option click from side-nav 
        driver.findElement(By.linkText("Post New Message")).click();     //CLick Post New Message option from messaging page
        
        
        //4. Fill the Form and click Send
        
        driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("Testing"); //Send data to input box Title
        
        // go to text area inside frame 
        WebElement webelement =  driver.findElement(By.xpath("/html/body"));   //Select frame element
        Actions action = new Actions(driver);    
        action.moveToElement(webelement).click().perform();                    //Mouse click for able to type
        action.sendKeys("Entering data").perform();                         
        Thread.sleep(1000);
        
        WebElement datepicker1 = driver.findElement(By.xpath("//input[@id=\"date\"]")); //Select Notice Date 
        datepicker1.sendKeys("05032023");
        Thread.sleep(1000);
        
        WebElement datepicker2 = driver.findElement(By.xpath("//*[@id=\"publish_date\"]")); //Select Publish On Dqte
        datepicker2.sendKeys("06032023");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[3]/div/button")).click(); //Select Submit Button
        
        
        //5. Verify the message “Record Saved Successfully”

        //alert message printing.
	    WebElement successfull_msg = driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/div/div[1]"));
        String msg = successfull_msg.getText();
        boolean verify = msg.equals("Record Saved Successfully");
        if(verify) {
        	System.out.println("Message Verified . "+msg);
        }else {
        	System.out.println("Message not mathched . Data is Not Sucessfully Submited");
        }
        
        driver.quit();
	}

}
