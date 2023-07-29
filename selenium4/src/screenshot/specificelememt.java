package screenshot;

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

public class specificelememt {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String s="demo";
		String s1=RandomString.make(2);
		WebElement web=driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		File source=((TakesScreenshot)web).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\DELL\\eclipse-workspace\\selenium4\\screenshot\\"+s+" "+s1+".jpg");
		FileHandler.copy(source, dest);
	}

}
