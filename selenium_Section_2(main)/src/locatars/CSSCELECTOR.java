package locatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSCELECTOR {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
WebDriver driver=new ChromeDriver();
driver.get("https://www.onlinesbi.sbi/");
driver.manage().window().maximize();

// css by tagname + attribute 
WebElement web=driver.findElement(By.cssSelector("span[class=\"classicTxt\"]"));
web.click();
driver.findElement(By.cssSelector("a[class=\"login_button\"]")).click();
Thread.sleep(4000);
driver.close();
	}

}
