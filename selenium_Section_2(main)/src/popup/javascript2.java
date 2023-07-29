package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript2 {

	public static void main(String[] args) {

		// alert and conformation popup
		// accept or dismiss method
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	    String s=driver.switchTo().alert().getText();
	    System.out.println(s);
		driver.switchTo().alert().dismiss();
	}

}
