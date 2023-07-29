package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo2 {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void openurl() {
		System.setProperty("WebDriver.chrome.driver", "D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	
	@Test(dataProvider = "userdata")
	public void penpage(String id, String password, String Expexted) throws InterruptedException {
		
		String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
		driver.get(url);

		WebElement user = driver.findElement(By.xpath("//input[@autofocus=\"autofocus\"]"));
		user.clear();
		Thread.sleep(2000);
		user.sendKeys(id);

		WebElement pass = driver.findElement(By.xpath("//input[@class=\"password\"]"));
		pass.clear();
		Thread.sleep(2000);
		pass.sendKeys(password);

		WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		loginbutton.click();
		Thread.sleep(3000);
		
		String text = driver.getTitle();
		String act_text = "Dashboard / nopCommerce administration";

		if (Expexted.equals("valid"))
			if (act_text.equals(text)) {
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		else if (Expexted.equals("invalid"))
			if (act_text.equals(text)) {
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
	}

	@AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();

	}

	@DataProvider(name = "userdata")
	public String[][] logindata() {

		String userdata[][] = { { "admin@yourstore.com", "admin", "valid" }, { "admin@yourstore.com34", "admin", "invalid" },
				{ "admin@yourstore.com", "admin123", "invalid" }, { "admin@yourstore.com23", "admin345", "invalid" },
				{ "", "admin", "invalid" } };
		return userdata;
	}
}
