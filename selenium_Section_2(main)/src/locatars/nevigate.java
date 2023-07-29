package locatars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nevigate {

	public static void main(String[] args) throws InterruptedException  {
System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com/");

driver.manage().window().maximize();

Thread.sleep(4000);

driver.navigate().to("https://www.jio.com/");// to navigate or open other url
Thread.sleep(4000);
driver.navigate().back();// to return previous url of page
Thread.sleep(5000); 
driver.navigate().forward(); // to move forward on page or app page
Thread.sleep(5000); 
driver.navigate().refresh(); // to refresh current page
Thread.sleep(5000); 
driver.close(); 

	}

}
