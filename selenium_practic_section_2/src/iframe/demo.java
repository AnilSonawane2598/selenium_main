package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("anil");
		driver.switchTo().parentFrame();
		String data = driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]")).getText();
		System.out.println(data);

		String s="Nested iFrames";
		if(data.equals(s)) {
			System.out.println("corect text");
		}
		else {
			System.out.println("wrong text");
		}
	}

}
