package parametrization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class usingwebsite {
	WebDriver driver;

	@BeforeMethod
	public void login() {
		System.setProperty("WebDriver.chrome.driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Parameters({ "user", "pass" })
	@Test
	public void enterdetails(String user,String pass) {

		WebElement input = driver.findElement(By.id("email"));
		input.sendKeys(user);

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass);

		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	}

	@AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
