package locatars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizemethod {
	public static void main(String[] args) throws InterruptedException  {
System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
Thread.sleep(5000); // to wait for some time
driver.close(); // to close 
	}
}
