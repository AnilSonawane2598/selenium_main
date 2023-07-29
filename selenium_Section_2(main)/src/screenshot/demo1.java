package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class demo1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String s=RandomString.make(5);
		String s1="demo";
		File destination=new File("D:\\AUTOMATION SCREENSHOT FOLDER SOURCE\\screenshot\\"+s1+" "+s+".jpg");
		
		FileHandler.copy(source, destination);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
