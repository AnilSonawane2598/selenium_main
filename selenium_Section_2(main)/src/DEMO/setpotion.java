package DEMO;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setpotion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();

Thread.sleep(4000);

Point p=new Point(500,100);
driver.manage().window().setPosition(p);
System.out.println(driver.manage().window().getPosition());
System.out.println(p); // to get current set position

Dimension d=new Dimension(700,500);
driver.manage().window().setSize(d);
System.out.println(driver.manage().window().getSize());
System.out.println(d);// to find current size of browser

driver.navigate().to("https://www.myvi.in/");
Thread.sleep(4000);
driver.navigate().back();
Thread.sleep(4000);
driver.navigate().forward();
Thread.sleep(4000);
driver.navigate().refresh();


Thread.sleep(4000);
driver.quit();

	}

}
