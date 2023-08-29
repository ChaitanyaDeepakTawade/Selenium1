package com.selenium.Day7;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/*t
 * simple code for select & display multiple options.
 * @author chaitanya tawade(Expleo Pune).
 * @sign jdk 1.7 29/08/2023.
 * */

public class MultipleOptionsSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm?firstname=&lastname=&photo=&continents=Asia&selenium_commands=Navigation+Commands&selenium_commands=Switch+Commands&selenium_commands=Wait+Commands&selenium_commands=WebElement+Commands&submit=");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[10]/td[2]/select")));		
        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByIndex(2);
        List <WebElement>list=new ArrayList<>();
        list=select.getAllSelectedOptions();
        System.out.println("---------Selected options---------");
        for(WebElement l:list) {
        	System.out.println(l.getText());      	
        }
        

	}

}
