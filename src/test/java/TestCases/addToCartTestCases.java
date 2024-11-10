package TestCases;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Resources.baseClass;

public class addToCartTestCases extends baseClass {

	@Test
	public void verifyProductPriceBeforeAndAfter() throws IOException {

		initializeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone");

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

		
	    String iphoneCost=driver.findElement(By.xpath("//p[@class='price']")).getText();
		
		System.out.println(iphoneCost);
		
		String iphoneArray[]=iphoneCost.split(" ");
		
		System.out.println(Arrays.toString(iphoneArray));
		
		String iphoneArrayFE = iphoneArray[0];
		System.out.println(iphoneArrayFE);
		
		String iphoneCostWithnumber =iphoneArrayFE.replaceAll("[^\\d.]", "");
		System.out.println(iphoneCostWithnumber);
		
		double finaliphoneCost=  Double.parseDouble(iphoneCostWithnumber);
		System.out.println(finaliphoneCost);
		
		//Hw -- 0 -dont remove 0.
		
		//addtocart.click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("samsung");

		
		
		
		 String iphoneCost=driver.findElement(By.xpath("(//p[@class='price'])[2]")).getText();
			
			System.out.println(iphoneCost);
			
			String iphoneArray[]=iphoneCost.split(" ");
			
			System.out.println(Arrays.toString(iphoneArray));
			
			String iphoneArrayFE = iphoneArray[0];
			System.out.println(iphoneArrayFE);
			
			String iphoneCostWithnumber =iphoneArrayFE.replaceAll("[^\\d.]", "");
			System.out.println(iphoneCostWithnumber);
			
			double finaliphoneCost=  Double.parseDouble(iphoneCostWithnumber);
			System.out.println(finalsamsungCost);
		
			
			//Add to cart.click();
			
			double c= finalCot+foinalsmsanung ; 365.19
			//connvet double -->String  -- ad doll
			
			"$"+c;  //$365.19
			
			
			
			//captureThTotalvalufromcart  - $365.19
			
			
			
		
		
	}

}