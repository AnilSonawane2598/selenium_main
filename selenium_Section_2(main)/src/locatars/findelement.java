package locatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");	
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();	
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'AGENT LOGIN')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='I Agree']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='Agent Login With Otp']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@formcontrolname=\"userid\"]")).sendKeys("ANILSONAWANE");
		driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]")).sendKeys("Anil@1233");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()=\"HILL RAILWAYS\"]")).click();	
		Thread.sleep(4000);
		driver.quit();
	}

}
//tagname[contains(text(),'text value')]
//a[contains(text(),' CONTACT US ')]

//strong[text()='ALERTS']
//a[contains(text(),'FLI')]
