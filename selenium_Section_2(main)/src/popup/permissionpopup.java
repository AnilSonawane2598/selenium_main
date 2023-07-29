package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class permissionpopup {
	
	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");

		// permission popups
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
	}

}
