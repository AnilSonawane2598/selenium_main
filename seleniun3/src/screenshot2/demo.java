package screenshot2;

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

public class demo {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		// for page ss
		File first=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String s1=RandomString.make(4);
		String s2="auto";
		File last=new File("C:\\Users\\DELL\\eclipse-workspace\\seleniun3\\screenshot\\"+s2+" "+s1+" .jpg");
		FileHandler.copy(first, last);
		
		Thread.sleep(3000);
		
		// for specific element ss
		WebElement ss=driver.findElement(By.xpath("//img[@id=\"imagetrgt\"]"));
		File first1=((TakesScreenshot)ss).getScreenshotAs(OutputType.FILE);
		String s3=RandomString.make(2);
		String s4="logo";
		File last1=new File("C:\\Users\\DELL\\eclipse-workspace\\seleniun3\\screenshot\\"+s4+" "+s3+" .jpg");
		FileHandler.copy(first1, last1);
		
		
	}

}
