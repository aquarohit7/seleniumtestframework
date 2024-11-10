package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RegisterPageObjects {

	public WebDriver driver; // This driver dont have any scope

	private By firstName = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By eMail = By.xpath("//input[@name='email']");
	private By Telephone = By.xpath("//input[@name='telephone']");
	private By Password = By.xpath("//input[@name='password']");
	private By PasswordConfirm = By.xpath("//input[@name='confirm']");
	private By SubscribeYes = By.xpath("//input[@name='newsletter']");
	private By PrivacyPolicy = By.xpath("//input[@name='agree']");
	private By Continue = By.xpath("//input[@value='Continue']");
	private By accountCreationSuccess = By.xpath("//h1[text()='Your Account Has Been Created!']");
	private By firstNameWarnig = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By lastnameWarnig = By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	private By eMailWarnig = By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	private By TelephoneWarnig = By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	private By PasswordWarnig = By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	private By PrivacyPolicyWarnigText = By.xpath(" //div[text()=' Warning: You must agree to the Privacy Policy!']");
	
	


	public RegisterPageObjects(WebDriver driver) {
		this.driver = driver;// We have assigned the scope

	}
	
	
	public WebElement getfirstName() {
		return driver.findElement(firstName);

	}

	public WebElement getLastName() {
		return driver.findElement(lastname);

	}

	public WebElement geteMail() {
		return driver.findElement(eMail);

	}

	public WebElement getTelephone() {
		return driver.findElement(Telephone);

	}

	public WebElement getPassword() {
		return driver.findElement(Password);

	}

	public WebElement getPasswordConfirm() {
		return driver.findElement(PasswordConfirm);

	}

	public WebElement getSubscribe() {
		return driver.findElement(SubscribeYes);
	}

	public WebElement getPrivacyPolicy() {
		return driver.findElement(PrivacyPolicy);

	}

	public WebElement getContinue() {
		return driver.findElement(Continue);
	}
	
	
	
	public WebElement accountCreationSuccess() {
		
		return driver.findElement(accountCreationSuccess);
	}
	

	public WebElement getfirstNameWarnig() {
		return driver.findElement(firstNameWarnig);

	}

	public WebElement getLastNameWarnig() {
		return driver.findElement(lastnameWarnig);

	}

	public WebElement geteMailWarnig() {
		return driver.findElement(eMailWarnig);

	}

	public WebElement getTelephoneWarnig() {
		return driver.findElement(TelephoneWarnig);

	}

	public WebElement getPasswordWarnig() {
		return driver.findElement(PasswordWarnig);

	}
	
	public WebElement getPrivacyPolicyWaring() {

		return driver.findElement(PrivacyPolicyWarnigText);
	}
	
		

}