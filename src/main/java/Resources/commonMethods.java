package Resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class commonMethods {
	
	public static void handleAssertion(String actualString, String expectedString) {
		
		SoftAssert sa = new SoftAssert();

		String actual = actualString;
		String expected = expectedString;

		sa.assertEquals(actual, expected);

		sa.assertAll();
		
	}
	
	public static void handleExplictWait(WebDriver driver, int time, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
	    wait.until(ExpectedConditions.visibilityOf(element));	
	}
	
}