package org.mymavenproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAnnotation {

	public static WebDriver driver;
	@Test
	public void sum() {
		System.out.println("This is sum method");
	}
	
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	@AfterClass
	public static void terminate() {
		driver.quit();
	}
	
	@Test
	public void sub() {
		System.out.println("This is sub method");
	}
	
	@Test
	public void mul() {
		System.out.println("This is mul method");
		}
	
	@Ignore
	@Test
	public void div() {
		System.out.println("This is div method");
	}
}
