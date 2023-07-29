package syncronization_waits;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;

public class explicitwait {

	public static void main(String[] args) throws IOException {

		System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jio.com/");
		driver.manage().window().minimize();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String s="jio";
		String s1=RandomString.make(2);
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\selenium(main)\\screenshot\\"+s+" "+s1+".jpg");
		FileHandler.copy(source, dest);
		String s2="(//div[text()='Recharge'])[5]";
		// explicit waits syntax
		WebDriverWait mywaits=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement ele=	mywaits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s2)));
		ele.click();
		
	}

}
