package org.convert.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConvertClass {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.myntra.com");
		
		driver.navigate().to(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}

}
