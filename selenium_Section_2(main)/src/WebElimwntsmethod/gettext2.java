package WebElimwntsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	String s=	driver.findElement(By.xpath("//a[text()='Create new account']")).getText();
	//System.out.println(web.getText());
	String s1="Create new account";
	if(s.equals(s1)) {
		System.out.println("cottect text");
	}
	else
		System.out.println("wrong text");
	
	}
}
