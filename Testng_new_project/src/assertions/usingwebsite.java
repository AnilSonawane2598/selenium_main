package assertions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class usingwebsite {
	WebDriver driver;

	@BeforeClass
	public void login() {
		System.setProperty("WebDriver.chrome.driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void enterdetails() {
		String text = driver.findElement(By.xpath("//a[text()='Create new account']")).getText();
		Assert.assertEquals(text, "Create new account");

		String text1 = driver.findElement(By.xpath("//button[@value=\"1\"]")).getText();
		System.out.println(text1);
	}

	@AfterClass
	public void exit() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
