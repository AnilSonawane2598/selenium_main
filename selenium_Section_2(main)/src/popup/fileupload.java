package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	// file upload popup
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
	//	driver.switchTo().alert();
		driver.findElement(By.name("file")).sendKeys("C:\\Users\\DELL\\Downloads\\wp2506817-nature-4k-wallpapers.jpg");
		driver.findElement(By.id("file-submit")).click();
	}

}
