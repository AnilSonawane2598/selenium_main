package baseclass_packakge;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import congiguration_package.readconfigfile_class;

public class base_class {
	public static WebDriver driver;
	public static Logger logger;

	readconfigfile_class rc = new readconfigfile_class();
	public String user = rc.getusername();
	public String pass = rc.getpassword();
	public String cdriver = rc.getchromedriver();

	@SuppressWarnings({ "deprecation", "static-access" })
	@BeforeMethod
	public void openpage() {
		System.setProperty("WebDriver.chrome.driver", rc.getchromedriver());
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		logger = logger.getLogger("open log page");
		PropertyConfigurator.configure(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_project_File\\src\\test\\resources\\configuration_and_log4j\\log4j.properties");
		logger.info("open page");
		driver.get(rc.geturl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void closepage() {
		driver.quit();
		logger.info("close page");
	}
}
