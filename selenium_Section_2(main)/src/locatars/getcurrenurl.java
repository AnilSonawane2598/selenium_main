package locatars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenurl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	String s=driver.getCurrentUrl();
	System.out.println(s);
	
//	String s2=new String("https://mail.google.com/");
if(s.equals("https://www.youtube.com/"))
	System.out.println(" currect url");
	
else 
{
	System.out.println(" wrong url");
}
	Thread.sleep(5000);
	driver.close();
	 
	
	}
}
