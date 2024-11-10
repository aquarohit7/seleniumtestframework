package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;
import pageObjectModel.HomePageObjects;
import pageObjectModel.LoginPageObjects;

public class loginTestCases extends baseClass{
	
	
	@Test
	public void  verifyLoginWithValidData() throws IOException {
		
		
		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.clickOnMyAccount().click();
		
		hpo.clickOnlogin().click();
		
	
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.enterEmail().sendKeys(email);
		lpo.enterLoginPassword().sendKeys(constants.password);
		lpo.clickOnSubmit().click();
		commonMethods.handleAssertion(lpo.AccountLoggedin().getText(), "My Account");
	
	}

}