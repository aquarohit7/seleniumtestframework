package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class baseClass {

	public static WebDriver driver;
	public Properties prop;

	public static String email = generateRandomEmailID();

	public void initializeDriver(String browserName) throws IOException {

		// This will help to to read the data.properties file
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");

		// This will help us to load the porpeties file inside the prop refrence
		prop = new Properties();
		prop.load(fis);

	//	String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("fireFox")) {

			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else {

			System.out.println("please pass the correct browser value");
		}

	}

	public static String generateRandomEmailID() {
		return "test" + System.currentTimeMillis() + "@gmail.com";

	}

	// To take the screenshot and store in one folder-
	public static String screenShot(WebDriver driver, String filename) {
		String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		// 20241107080800

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\Screenshots\\" + filename + "_" + date + ".png";
		try { // VerifyRresgiertaionWithValiData_20241107080800.png
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}

	@BeforeSuite
	public void ExtentReport() {
		extentReportManager.setup();
	}

	@AfterSuite
	public void endReport() {
		extentReportManager.endReport();
	}

	@BeforeMethod
	@Parameters("browser")
	public void browserlaunch(String browser) throws IOException {

		initializeDriver(browser);
		String url = prop.getProperty("url");
		driver.get(url);
	}

	@AfterMethod
	public void browserClose() {
	//	driver.quit();
	}

}