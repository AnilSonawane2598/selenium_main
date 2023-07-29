package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript3 {

	public static void main(String[] args) throws InterruptedException {

		// alert and conformation popup
		//  verify popup text and sendkeys method
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert al=driver.switchTo().alert();
	String s=al.getText();
	System.out.println(s);
	String s1="I am a JS prompt";
	if(s1.equals(s)) {
		System.out.println("corect text");
	}
		else {
			System.out.println("wrong text");
	}
	
	al.sendKeys("anil sonawane");
	Thread.sleep(3000);
	al.accept();
//	al.dismiss();
}	
}
