package org.mymavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeClass {
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.myntra.com");
		Thread.sleep(3000);
		driver.navigate().to(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}
}
