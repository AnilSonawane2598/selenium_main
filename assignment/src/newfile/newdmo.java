package newfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class newdmo { // not working

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//input[@role=\"searchbox\"]")).sendKeys("pune");
	Thread.sleep(3000);
	List<WebElement> s=driver.findElements(By.xpath("//input[@type=\"text\"]"));
	System.out.println(s.size());
	Thread.sleep(4000);
	for(int i=0;i<s.size();i++) {
		String s1=s.get(i).getText();
		System.out.println(s1);
		System.out.println(s1);{
			if(s1.contains("pune"))
				s.get(i).click();
		}
	}
	Thread.sleep(3000);
	driver.quit();
	}

}
