package testng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.utility.RandomString;


public class facebook5 {
	WebDriver driver;
	@Parameters("url")
	@BeforeClass
	public void openurl(String url) {
		System.setProperty("WebDriver.chrome.driver", "D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Parameters({"name","pass1"})
	@Test(enabled=true,expectedExceptions=Exception.class)
	public void loginpage(String name,String pass1) throws InterruptedException {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(name);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass1);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		int a=10/0;
		System.out.println(a);
		SoftAssert soft=new SoftAssert();
		soft.assertAll();
	}

	@Test(dependsOnMethods="loginpage")
	public void newpage() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("anil");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='" + "sonawane" + "';", ele);
		js.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(3000);

		WebElement day = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select s = new Select(day);
		s.selectByVisibleText("3");
		Thread.sleep(3000);

		List<WebElement> month = driver.findElements(By.xpath("//select[@name=\"birthday_month\"]//option"));
		System.out.println(month.size());
		for (int i = 0; i < month.size(); i++) {
			if (month.get(i).getText().equals("Jan"))
				month.get(i).click();
		}

		WebElement button = driver.findElement(By.xpath("//label[text()='Male']"));
		System.out.println(button.isDisplayed());
		System.out.println(button.isEnabled());
		button.click();

		String text = driver.findElement(By.xpath("//div[text()='Sign Up']")).getText();
		String act_text = "Sign Up";
		Assert.assertEquals(act_text, text);

	}
	
	@Test
	public void ss() throws IOException {
		String path="C:\\Users\\DELL\\eclipse-workspace\\Testng_practice\\screenshot";
		String s="fb";
		String s1=RandomString.make(2);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(path+" "+s+" "+s1+".jpg");
		FileHandler.copy(source, dest);
		
	}
	

	@AfterClass
	public void end() {
		driver.quit();
	}

}
