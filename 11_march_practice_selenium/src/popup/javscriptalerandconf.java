package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javscriptalerandconf {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
	Alert	al=driver.switchTo().alert();
	al.sendKeys("anil");
	System.out.println(al.getText());
	String text="Please enter your name";
	if(al.getText().equals(text)) {
		System.out.println("correct text");
	}
	else {
		System.out.println("wrong text");
	}
	Thread.sleep(3000);
	al.accept();
		
	}

}
