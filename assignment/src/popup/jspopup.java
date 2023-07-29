package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jspopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Thread.sleep(3000);
		
		Alert al=driver.switchTo().alert();
		String s1=al.getText();
		System.out.println(s1);
		
		driver.switchTo().alert().dismiss();
		
		
	}

}
