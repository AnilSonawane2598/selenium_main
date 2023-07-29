package locatars;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jio.com/");

	
	Thread.sleep(5000);

	driver.manage().window().minimize();

	Thread.sleep(5000);

	Point p=new Point(499,300);
	driver.manage().window().setPosition(p);
//	System.out.println(p);
	
	
	String s= driver.getTitle();
	System.out.println(s);
	
	String s2=driver.getCurrentUrl();
	System.out.println(s2);
	
	
	System.out.println("current title is  "+driver.getTitle());
	
	System.out.println("current url is  "+driver.getCurrentUrl());
	
//	String s1="Gmail";
//	if (s.equals(s1)) {
//		System.out.println(" correct title");
//	}
//		else {
//			System.out.println("WRONG TITLE");
//		}
//	
	Thread.sleep(5000);
	driver.close();
	
	}

}
