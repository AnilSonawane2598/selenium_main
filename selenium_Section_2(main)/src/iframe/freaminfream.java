package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class freaminfream {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		driver.switchTo().frame(1);
//		WebElement one=	driver.findElement(By.xpath("//div[contains(@id,\"Multiple\")]//iframe"));
//		driver.switchTo().frame(one);
		
		String text=driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]")).getText();
		System.out.println(text);
		
		// to check text is correct or not
		String s="Nested iFrames";
		if(text.equals(s)) {
			System.out.println("correct text");
		}
		else {
			System.out.println("wrong text");
		}
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("anil");
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	
		Thread.sleep(3000);
		driver.close();
		
	}

}
