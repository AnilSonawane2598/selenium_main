package listbox;

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
		
	//(//select[@type="text"]//option)[1]
		////select[@type=\"text\"]//option
		String opt="Adobe InDesign";
	List<WebElement> skill=driver.findElements(By.xpath("(//select[@type=\"text\"])[1]//option"));
	Thread.sleep(3000);
	System.out.println(skill.size());
	
	for(int i=0;i<skill.size();i++) {
		String s=skill.get(i).getText();
		System.out.println(s);{
			if(s.equals(opt))
				skill.get(i).click();
		}
	}
	Thread.sleep(4000);
	driver.quit();
	}

}
