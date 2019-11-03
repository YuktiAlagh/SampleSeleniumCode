package FirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");   //setting properties for driver 
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
}
