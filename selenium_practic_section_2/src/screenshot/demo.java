package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class demo {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		String s = "demo";
		String s1 = RandomString.make(2);
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\selenium_practic_section_2\\screenshot\\" + s + " " + s1 + ".jpg");
		FileHandler.copy(source, dest);

		WebElement ele = driver.findElement(By.xpath("//a[text()='Create new account']"));
		String a = "fb";
		String b = RandomString.make(2);
		File source1 = ((TakesScreenshot) ele).getScreenshotAs(OutputType.FILE);
		File dest1 = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\selenium_practic_section_2\\screenshot\\" + a + " " + b + ".jpg");
		FileHandler.copy(source1, dest1);
	}

}
