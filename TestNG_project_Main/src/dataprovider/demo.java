package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo {
	WebDriver driver;

	@Test(dataProvider = "logindata")
	public void penpage(String id, String password) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement user = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		user.sendKeys(id);

		WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.sendKeys(password);

		WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		loginbutton.click();

		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//span[text()='Admin']")).getText();
		String act_text = "Admin";
		Assert.assertEquals(act_text, text);
		driver.close();

	}

	@DataProvider(name = "logindata")
	public Object[][] logindata() {
		Object data[][] = new Object[5][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin";
		data[1][1] = "admin1235";

		data[2][0] = "Admin23";
		data[2][1] = "admin123";

		data[3][0] = "Admin12";
		data[3][1] = "admin12334";

		data[4][0] = "";
		data[4][1] = "admin123";

		return data;
	}
}
