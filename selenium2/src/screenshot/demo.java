package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo {

	public static void main(String[] args) throws IOException {
System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\AUTOMATION SCREENSHOT FOLDER SOURCE\\screenshot.jpg");
FileHandler.copy(source, dest);
driver.close();
	}

}
