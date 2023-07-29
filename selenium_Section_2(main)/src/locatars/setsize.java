package locatars;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(400);
			
			Dimension d=new Dimension(0,0);
			driver.manage().window().setSize(d);
			
			
			Thread.sleep(5000);
			driver.close();
}
}