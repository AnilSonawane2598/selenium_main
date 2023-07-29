package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ssinprjectfolder {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String s="demo";

		m(s);
		Thread.sleep(2000);
		driver.close();
	}
public static void m(String filename) throws IOException {
	String s1=RandomString.make(4);
	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\SELINEUM\\screenshot\\"+filename+" "+s1+".jpg");
	
	FileHandler.copy(source, dest);

}
}
