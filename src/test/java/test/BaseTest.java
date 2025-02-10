package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver;
	String url = "https://www.facebook.com";
	
	//opening the browser
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	//closing the browser
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
}
