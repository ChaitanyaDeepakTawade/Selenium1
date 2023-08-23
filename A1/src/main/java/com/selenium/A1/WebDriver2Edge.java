package com.selenium.A1;

import java.util.Set;

import javax.swing.text.TabableView;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class WebDriver2Edge {
	
	public static void main(String args[]) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.dypcoei.edu.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.get("https://www.dypcoei.edu.in/");
	    //driver.navigate().back();
		//Thread.sleep(3000);
		//driver.navigate().forward();
		//driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getPageSource().length());
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://hourglass.in.expleogroup.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.quit(); 
		Set <String> str = driver.getWindowHandles();
		
		for(String h: str) {
			System.out.println(driver.switchTo().window(h));
			System.out.println(driver.getTitle());
		}
	}

}
