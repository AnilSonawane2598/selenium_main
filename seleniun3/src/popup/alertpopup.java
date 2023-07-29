package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertpopup {

	public static void main(String[] args) {
	//	ChromeOptions option =new ChromeOptions();
	//	option.addArguments("--disable-notifications");
		
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("anil");
		al.accept();
	}

}
