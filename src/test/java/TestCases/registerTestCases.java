package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;
import pageObjectModel.HomePageObjects;
import pageObjectModel.RegisterPageObjects;

public class registerTestCases extends baseClass {

	@Test
	public void verifyRegsiterationWithValidData() throws IOException, InterruptedException {


		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnregsiter().click();

		RegisterPageObjects rpo = new RegisterPageObjects(driver);
	    commonMethods.handleExplictWait(driver, 2, rpo.getfirstName());
	    
	    
		rpo.getfirstName().sendKeys(constants.firstName);
		rpo.getLastName().sendKeys(constants.lastName);
		rpo.geteMail().sendKeys(email);
		rpo.getTelephone().sendKeys(constants.telephone);
		
	  //  commonMethods.handleExplictWait(driver, 5, rpo.getPassword());

		rpo.getPassword().sendKeys(constants.password);
		

		rpo.getPasswordConfirm().sendKeys(constants.password);
		rpo.getSubscribe().click();
		rpo.getPrivacyPolicy().click();
		rpo.getContinue().click();
		commonMethods.handleAssertion(rpo.accountCreationSuccess().getText(), constants.suucefullActCreation);
		
	}

	@Test
	public void verifyRegsiterationWithBlankData() throws IOException {

		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnregsiter().click();

		RegisterPageObjects rpo = new RegisterPageObjects(driver);

		rpo.getContinue().click();

		String firsNameWaringExpected = "F Name must be between 1 and 32 characters!";
		String firsNameWaringActual = rpo.getfirstNameWarnig().getText();		
		commonMethods.handleAssertion(firsNameWaringActual, firsNameWaringExpected);

		String lastNameWaringExpected = "Last Name must be between 1 and 32 characters!";
		String lastNameWaringActual = rpo.getLastNameWarnig().getText();

		commonMethods.handleAssertion(lastNameWaringActual, lastNameWaringExpected);

		String MailWarnigExpected = "E-Mail Address does not appear to be valid!";
		String MailWarnigActual = rpo.geteMailWarnig().getText();
		commonMethods.handleAssertion(MailWarnigActual, MailWarnigExpected);

		String TelephoneWaringExpected = "Telephone must be between 3 and 32 characters!";
		String TelephoneWaringActual = rpo.getTelephoneWarnig().getText();
		commonMethods.handleAssertion(TelephoneWaringActual, TelephoneWaringExpected);

		String PasswordWaringExpected = "Password must be between 4 and 20 characters!";
		String PasswordWaringActual = rpo.getPasswordWarnig().getText();
		commonMethods.handleAssertion(PasswordWaringActual, PasswordWaringExpected);

		String privacypolicyWarningExpected = "Warning: You must agree to the Privacy Policy!";
		String privacypolicyWarningWaringActual = rpo.getPrivacyPolicyWaring().getText();
		commonMethods.handleAssertion(privacypolicyWarningWaringActual, privacypolicyWarningExpected);

	}

}