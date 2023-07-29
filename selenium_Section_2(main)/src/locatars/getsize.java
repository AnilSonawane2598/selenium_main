package locatars;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.youtube.com/");
			
		//	driver.manage().window().maximize();
			
			Thread.sleep(4000); // time provide
			
			Dimension d=new Dimension(400,600);
			driver.manage().window().setSize(d);
			
			Thread.sleep(5000);
			
			System.out.println(driver.manage().window().getSize()); // get the size of browser
			driver.close();
}
}