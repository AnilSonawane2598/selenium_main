package webdriver2;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allmethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
//	driver.navigate().to("https://www.youtube.com/");
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.navigate().refresh();
	
	String title=driver.getTitle();
	System.out.println(title);
	System.out.println(driver.getTitle());
	
	String s="Facebook – log in or sign up"
			+ "";
	if(s.equals(title)) {
		System.out.println("correct title");
	}
	else {
		System.out.println("wrong title");
	}
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	Dimension d=new Dimension(200,200);
	driver.manage().window().setSize(d);
	System.out.println(driver.manage().window().getSize());
	
	Point p=new Point(300,400);
	driver.manage().window().setPosition(p);
	System.out.println(driver.manage().window().getPosition());
	
	
	Thread.sleep(4000);
	driver.close();
	}

}
