package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class pagescreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String s="C:\\Users\\DELL\\eclipse-workspace\\11_march_practice_selenium\\screenshot\\";
		String s1="fb";
		String s2=RandomString.make(2);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(s+" "+s1+" "+s2+".jpg");
		FileHandler.copy(source, dest);
	}

}
