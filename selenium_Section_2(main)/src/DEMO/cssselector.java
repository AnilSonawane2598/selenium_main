package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nutrabay.com/");
		driver.manage().window().maximize();
		
	// css by atribute
	//	driver.findElement(By.cssSelector("[name=s]")).sendKeys("on");
		
		// by tagname and attribute
		driver.findElement(By.cssSelector("input[name=\"s\"]")).sendKeys("on");

		
	}

}
