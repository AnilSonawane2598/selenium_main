package locatars;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipletab {

		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.jio.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			Dimension d=new Dimension(600,700);
			driver.manage().window().setSize(d);
			System.out.println("BROWSER SIZE IS   "+driver.manage().window().getSize());
			
			Thread.sleep(4000);
			
			Point p=new Point(200,50);
			driver.manage().window().setPosition(p);
			System.out.println("BROWSER POSTION IS  "+driver.manage().window().getPosition());
			
	//		System.out.println(driver.getTitle());
			
	//		System.out.println(driver.getCurrentUrl());
			
			driver.navigate().to("https://www.youtube.com/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			
			
			String s="Jio - Best Prepaid, Postpaid Plans, WiFi Connection & Mobile Apps";
		if(s.equals("Jio - Best Prepaid, Postpaid Plans, WiFi Connection & Mobile Apps")) {
			System.out.println(" currect title");
		}
		else {
			System.out.println("wrong url");
		}
		//	String s2=driver.getCurrentUrl();
		//	System.out.println(s2);
			
		//	String s3=driver.getTitle();
		//	System.out.println(s3);
			
			System.out.println("CURRENT TITLE IS  "+driver.getCurrentUrl());
			System.out.println("THE TITLE IS  "+driver.getTitle());
					
			Thread.sleep(5000); // to wait for some time
			driver.close(); // to close 

		
	}

}
