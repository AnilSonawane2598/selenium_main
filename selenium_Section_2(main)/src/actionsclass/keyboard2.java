package actionsclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WbDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.ALT);
		act.build().perform();
		
		Thread.sleep(3000);
		
		act.keyDown(Keys.ENTER);
		act.build().perform();
		Thread.sleep(3000);
		
		act.keyUp(Keys.BACK_SPACE);
		act.build().perform();

		
		
		
	}

}
