package webmethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
WebDriver driver =new ChromeDriver();
driver.get("https://www.jio.com/");

driver.manage().window().maximize();

//driver.navigate().to("https://www.youtube.com/");
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();

String title=driver.getTitle();
System.out.println(title);
System.out.println(driver.getTitle());

String s="Jio - Best Prepaid, Postpaid Plans, WiFi Connection & Mobile Apps";
if(s.equals(title)) {
	System.out.println("correct title");
}
else {
	System.out.println("wrong title");
}
Thread.sleep(4000);

String url=driver.getCurrentUrl();
System.out.println(url);
System.out.println(driver.getCurrentUrl());
Thread.sleep(4000);

Dimension d=new Dimension(200,200);
driver.manage().window().setSize(d);
System.out.println(driver.manage().window().getSize());
Thread.sleep(4000);


Point p=new Point(100,100);
driver.manage().window().setPosition(p);
System.out.println(driver.manage().window().getSize());



Thread.sleep(4000);
driver.close();
	
	
	
	}

}
