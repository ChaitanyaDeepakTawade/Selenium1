package com.selenium.Day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * simple code dispaly and filter contain from the drop down list.
 * @author chaitanya tawade(Expleo Pune).
 * @sign jdk 1.7 29/08/2023.
 * */
public class DropDownOptionTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		
		List<WebElement> op=sel.getOptions();
		
		for(WebElement  itr:op) {
			System.out.println(itr.getText());
			
		}
		
		List<String>str = new ArrayList<>();
		
		for(WebElement  itr:op) {
			str.add(itr.getText());			
		}
		Collections.sort(str);		
		System.out.println(str);

	}

}
