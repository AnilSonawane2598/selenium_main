package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameinfrmae {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("anil");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
	String text=driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]")).getText();
		System.out.println(text);
		
		String s="Nested iFrames";
		if(text.equals(s)) {
			System.out.println("correct text");
		}
		else {
			System.out.println("wrong text");
		}
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
