package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertandconfermation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(3000);
	String str=	al.getText();
	System.out.println(str);
	String s="Please enter your name";
	if(str.equals(s)) {
		System.out.println("correct text");
	}
	else {
		System.out.println("qrong text");
	}
		al.sendKeys("anil");
		al.accept();
	//	al.dismiss();
		
		
	}

	
}
