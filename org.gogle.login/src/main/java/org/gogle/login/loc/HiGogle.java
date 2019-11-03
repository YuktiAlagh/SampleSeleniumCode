package org.gogle.login.loc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiGogle {
	
	@Test
	public void login(){
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.gmail.com");
	
	}
}
