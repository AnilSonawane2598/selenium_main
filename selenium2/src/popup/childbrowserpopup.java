package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		String parents=driver.getWindowHandle();
		System.out.println(parents);
		
		Set<String> childss1=driver.getWindowHandles();
		Thread.sleep(3000);
		System.out.println(" count is-->"+childss1.size());

		for(String s3:childss1) {
			if(!parents.equalsIgnoreCase(s3))
				driver.switchTo().window(s3);
			driver.close();
		}
	}

}
