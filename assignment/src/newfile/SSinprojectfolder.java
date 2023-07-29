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

import net.bytebuddy.utility.RandomString;

public class SSinprojectfolder {
static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
	//	String s1="demo";
		m("rr");
		Thread.sleep(3000);
		driver.close();
		
	}
public static void m(String str) throws IOException {
//	String s=RandomString.make(2);
	WebElement w=driver.findElement(By.xpath("//h2[text()='Login to Kite']"));
	File source=((TakesScreenshot)w).getScreenshotAs(OutputType.FILE);	
	File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\assignment\\screenshot\\kite.jpg");
	FileHandler.copy(source, dest);
//	"+str+" "+s+"

}
}
