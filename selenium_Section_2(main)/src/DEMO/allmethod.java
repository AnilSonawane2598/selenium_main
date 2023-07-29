package DEMO;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allmethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.chrome.driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
WebDriver driver=new ChromeDriver();
driver.get("https://nutrabay.com/");  //1

driver.manage().window().maximize();  //2

String s=driver.getCurrentUrl();
System.out.println(s);
System.out.println(driver.getCurrentUrl());  //3

String s1="https://nutrabay.com/";  // verify url
if(s.equals(s1)) {
	System.out.println("currect url");
}
else {
	System.out.println("wrong url");
}

String s2=driver.getTitle();  //4
System.out.println(s2);
System.out.println(driver.getTitle());

driver.navigate().to("https://www.healthkart.com/");  //5
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();

Dimension d=new Dimension(400,577);  //6
driver.manage().window().setSize(d);
System.out.println(driver.manage().window().getSize()); //  7

Point p=new Point(467,876);   //  8
driver.manage().window().setPosition(p);
System.out.println(driver.manage().window().getPosition());  // 9



Thread.sleep(4000);
driver.close();  // 10
//driver.quit();  // 11
	
	}

}
