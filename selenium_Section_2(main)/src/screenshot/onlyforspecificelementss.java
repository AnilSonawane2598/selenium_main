package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class onlyforspecificelementss {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement w=driver.findElement(By.xpath("//a[text()='Create new account']"));
		String s="demo";
		String s1=RandomString.make(3);
		File source=((TakesScreenshot)w).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\SELINEUM\\screenshot\\"+s+" "+s1+".jpg");
		FileHandler.copy(source, dest);
		Thread.sleep(4000);
		driver.close();
	}

}
