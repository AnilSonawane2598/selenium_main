package webdrivermethod;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allmethod {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://nutrabay.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String s=driver.getTitle();
		System.out.println(s);
	//	System.out.println(driver.getTitle());
		
		String title="NUTRABAY™ - India’s #1 Authentic Supplement Store Online";
		
		if(s.equals(title)) {
			System.out.println("correct title");
		}
		else {
			System.out.println("wrong title");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//System.out.println(driver.getCurrentUrl());
		
		Dimension d=new Dimension(200,200);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		
		Point p=new Point(200,200);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		
	//	driver.quit();
		driver.close();
	}

}
