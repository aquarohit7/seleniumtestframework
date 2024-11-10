package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePageObjects {
	
	public WebDriver driver;  //This driver dont have any scope
	
	private By myAccount =By.xpath("//a[@title='My Account']");
	private By register = By.xpath("//a[text()='Register']");
	private By login = By.xpath("//a[text()='Login']");
	
	
	
	
	public HomePageObjects(WebDriver driver) {
		this.driver=driver;//We have assigned the scope
		
	}

	public WebElement clickOnMyAccount() {
		return  driver.findElement(myAccount);	
	}
	
	public WebElement clickOnregsiter() {
		return  driver.findElement(register);	
	}
	
	
	public WebElement clickOnlogin() {
		return  driver.findElement(login);	
	}
	
	
	

}
