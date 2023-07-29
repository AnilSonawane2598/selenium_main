package locatars;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setpotion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			Thread.sleep(400);
			Dimension d=new Dimension(400,600);
			driver.manage().window().setSize(d);
			Thread.sleep(4000);
			Point p1=new Point(500,300);
			driver.manage().window().setPosition(p1);
			Thread.sleep(5000);
			driver.close();
}
}