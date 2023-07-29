package weballmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/"); // get method
driver.manage().window().maximize();// maximize method


String s=driver.getTitle();
System.out.println(s); // get title

String s1="Instagram";
if(s.equals(s1)) {
	System.out.println("currect");
}
else 
	System.out.println(" wrong");


String s2=driver.getCurrentUrl();
System.out.println(s2); // get currenturl

Thread.sleep(3000);

Dimension d=new Dimension(100,200);
driver.manage().window().setSize(d);  // set size
System.out.println(driver.manage().window().getSize()); // get size
Thread.sleep(3000);

Point p=new Point(6,8);
driver.manage().window().setPosition(p); // set position
System.out.println(driver.manage().window().getPosition());// get position

driver.manage().window().maximize();
driver.navigate().to("https://www.hotstar.com/");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();

Thread.sleep(4000);
driver.close(); // close method
	}

}
