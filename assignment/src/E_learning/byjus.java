package E_learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byjus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://byjus.com/learn/account/login");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("8007899138");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@title=\"Anil Sonawane\"]")).click();
		driver.findElement(By.xpath("//span[text()='My profile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).click();
		driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]//option[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]//option[99]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@tabindex=\"-1\"])[5]")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title=\"Anil Sonawane\"]")).click();
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		Thread.sleep(8000);
		driver.close();


	}

}
