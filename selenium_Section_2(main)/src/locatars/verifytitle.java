package locatars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifytitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");

	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.google.com/");
	driver.manage().window().maximize();
	String s= driver.getTitle();
	System.out.println(s);
	Thread.sleep(5000);
	driver.close();
	String s1="Gmail";
	if(s.equals(s1)) {
		System.out.println("correct");
		
	}
	else {
		System.out.println("WRONG TITLE");
}
}
}