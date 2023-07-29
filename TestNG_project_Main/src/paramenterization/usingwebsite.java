package paramenterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class usingwebsite {
	WebDriver driver;

	@Parameters("url")
	@BeforeClass
	public void login(String url) {
		System.setProperty("WebDriver.chrome.driver", "D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Parameters({ "email", "pass" })
	@Test
	public void enterlogindetails(String email, String pass) throws InterruptedException {
		// for user input
		WebElement userinput = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		userinput.sendKeys(email);
		Thread.sleep(5000);

		// for password
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys(pass);

		// click on login button
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();

		Thread.sleep(5000);

	}

	@AfterClass
	public void end() {

		driver.close();
	}
}
