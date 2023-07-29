package newfile;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSofentirepage {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("WebDriver.chrome.Driver", "D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		WebElement w=driver.findElement(By.xpath("//h2[text()='Login to Kite']"));
		
		File source=((TakesScreenshot)w).getScreenshotAs(OutputType.FILE);
		File dest1=new File("C:\\Users\\DELL\\eclipse-workspace\\assignment\\screenshot\\.jpg");
		File dest=new File("C:\\Users\\DELL\\Desktop\\kite\\.jpg");
		FileHandler.copy(source, dest1);
		Thread.sleep(3000);
		driver.close();
		
	}

}
