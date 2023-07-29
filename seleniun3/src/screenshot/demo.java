package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class demo {
static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

//		String s="demo";
//		String s2=RandomString.make(3);
//		String s1="C:\\Users\\DELL\\eclipse-workspace\\seleniun3\\screenshot\\"+s+" "+s2+".jpg";
//		File start=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File end=new File(s1);
//		FileHandler.copy(start, end);
//		System.out.println();
		
		String name="fb";
		m(name);
		Thread.sleep(4000);
		driver.close();
		
	}
public static void m(String str) throws IOException {
	String s3=RandomString.make(2);
	String  s4="C:\\Users\\DELL\\eclipse-workspace\\seleniun3\\screenshot\\"+str+" "+s3+".jpg";
	File start=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File end=new File(s4);
	FileHandler.copy(start, end);
}
}
