package locatars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closemethod { // close method

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(5000);
	driver.close();
	
	}

}
