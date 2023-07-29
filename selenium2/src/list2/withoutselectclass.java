package list2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselectclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		String s="17";
	List<WebElement> web=driver.findElements(By.xpath("(//select[@type=\"text\"])[5]//option"));
		System.out.println(web.size());
		
		Thread.sleep(4000);
		for(int i=0;i<web.size();i++) {
			String s1=web.get(i).getText();
			System.out.println(s1);{
				if(s1.equals(s))
					web.get(i).click();
			}
		}
		
	Thread.sleep(4000);
	driver.close();
	}

}
