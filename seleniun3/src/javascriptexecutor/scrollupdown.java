package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupdown {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", "webelement");
		js.executeScript("arguments[0].value='"+"anil"+"';", "webelement");
		js.executeScript("window.scrollBy(0,100)", "");
		
	}

}
