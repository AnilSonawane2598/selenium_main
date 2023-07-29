package WebElimwntsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String s="Create a Page";
String s1=		driver.findElement(By.xpath("//a[text()='Create a Page']")).getText();
		
		if(s.equals(s1)) {
			System.out.println("correct text");
		}
		else
			System.out.println("wrong text");
		
		Thread.sleep(4000);
		driver.close();
	}

}
