package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowbrowser {

	public static void main(String[] args) throws InterruptedException {
		// child window  popups
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[1]")).click();
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(3000);

		Set<String> childwindows=driver.getWindowHandles();
		
		for(String childwindow:childwindows) {
			if(!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				String s=driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers')]")).getText();
				System.out.println(s);
				Thread.sleep(3000);
				driver.close();	
			}
		}
		driver.switchTo().window(parentwindow);
		driver.close();
		
		
	}

}
