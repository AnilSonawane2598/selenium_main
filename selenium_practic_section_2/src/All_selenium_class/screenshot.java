package All_selenium_class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_project_practice\\src\\test\\resources\\drivers\\chromedriver_win32 (1)");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\DELL\\eclipse-workspace\\selenium_practic_section_2\\screenshot\\";
		String n = RandomString.make(4);
		String name = "automation";
		File dest = new File(path + name + n + ".jpg");
		FileHandler.copy(source, dest);
	}
}
