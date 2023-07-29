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

public class randomss {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String s="fb";
		String s1=RandomString.make(2);
	//	String s2="C:\\Users\\DELL\\eclipse-workspace\\SELINEUM\\screenshot\\.jpg";
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\SELINEUM\\screenshot\\"+s+" "+s1+" .jpg");
		FileHandler.copy(source, dest);
		
	}

}
