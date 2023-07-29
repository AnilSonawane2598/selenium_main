package testng;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class useofhashmap {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("WebDriver.chrome.Driver",
			"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	String name=useofhashmap.data().get(4);
	String s[]=name.split(":");

	driver.findElement(By.name("email")).sendKeys(s[0]);
	driver.findElement(By.id("pass")).sendKeys(s[1]);
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	driver.quit();
}
public static HashMap<Integer ,String> data()	{
	HashMap<Integer ,String> hm=new HashMap<Integer, String>();
	hm.put(1, "anil:anil123");
	hm.put(2, "anil:anil1232");
	hm.put(3, "anil12:anil123");
	hm.put(4, "anil12:anil1243");
	
	return hm;
	
}
}
