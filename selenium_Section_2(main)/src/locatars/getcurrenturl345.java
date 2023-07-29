package locatars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl345 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		String s=driver.getCurrentUrl();
		System.out.println(s);
		String s1="https://www.youtube.com/";
		System.out.println(driver.getCurrentUrl());
		
		if(s.equals(s1)) {
			System.out.println("correct url");
		}
		else
			System.out.println("wrong url");
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
