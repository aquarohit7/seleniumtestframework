package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPageObjects {
	
	public WebDriver driver;  //This driver dont have any scope
	
	private By email =By.xpath("//input[@name='email']");
	private By loginPassword = By.xpath("//input[@name='password']");
	private By submit = By.xpath("//input[@value='Login']");
	public By accountLoginSuccess = By.xpath("//h2[text()='My Account']");
	//public By accountLoginSuccess = By.xpath("//span[@class='caret']");
	
	
	
	
	
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;//We have assigned the scope
		
	}

	public WebElement enterEmail() {
		return  driver.findElement(email);	
	}
	
	public WebElement enterLoginPassword() {
		return  driver.findElement(loginPassword);	
	}
	
	
	public WebElement clickOnSubmit() {
		return  driver.findElement(submit);	
	}
	
	
	public WebElement AccountLoggedin() {
		return driver.findElement(accountLoginSuccess);
	}
	
	

}
