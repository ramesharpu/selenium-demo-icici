package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest{
	
	@Test
	public void urlValidation() {//from d1
		String expectedResult = "https://www.facebook.com/";
		String actualResult = driver.getCurrentUrl();
		
		Reporter.log("Expected Result - " + expectedResult);
		Reporter.log("Actual Result - " + actualResult );
		
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the URL");
	}

}
