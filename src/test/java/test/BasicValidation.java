package test;

import org.testng.annotations.Test;

public class BasicValidation extends BaseTest{
	
	@Test
	public void urlValidation() {
		String expectedResult = "https://www.facebook.com/";
		String actualResult = driver.getCurrentUrl();
	}

}
