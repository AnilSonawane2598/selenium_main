package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		// WebElement ele=driver.findElement(By.xpath("//img[@alt=\"Fashion\"]"));
		Actions act = new Actions(driver);
		// act.moveToElement(ele).perform();
		// driver.findElement(By.xpath("(//a[@class=\"_1BJVlg\"])[1]")).click();

//		act.doubleClick().perform();
//		act.contextClick().perform();
//		act.dragAndDrop(ele, ele);

		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("anil");

		// for control+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// for control+c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// for Tab
		act.sendKeys(Keys.TAB);
		act.perform();

		// control+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

	}

}
