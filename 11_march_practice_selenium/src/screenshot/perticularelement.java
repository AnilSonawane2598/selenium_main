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

public class perticularelement {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement sc = driver.findElement(By.xpath("//button[@value=\"1\"]"));

		String s = "C:\\Users\\DELL\\eclipse-workspace\\11_march_practice_selenium\\screenshot\\";
		String s3 = "demo";
		String s2 = RandomString.make(2);
		File source = ((TakesScreenshot) sc).getScreenshotAs(OutputType.FILE);
		File dest = new File(s + " " + s3 + " " + s2 + ".jpg");
		FileHandler.copy(source, dest);
		
		
		
		
		
		
		
		
	}

}
