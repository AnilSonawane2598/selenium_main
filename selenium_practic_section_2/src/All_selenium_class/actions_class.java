package All_selenium_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_project_practice\\src\\test\\resources\\drivers\\chromedriver_win32 (1)");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Actions act = new Actions(driver);
		// act.contextClick().perform();
		// act.doubleClick().perform();
		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Widgets']"));
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Accordion']")).click();
		driver.navigate().to("https://demo.automationtesting.in/Static.html");
		Thread.sleep(3000);
		WebElement a = driver.findElement(By.xpath("//div[@class='col-xs-10 col-xs-offset-2']//img[@id='mongo']"));
		WebElement b = driver.findElement(By.xpath("//div[@id='droparea']"));
		act.dragAndDrop(b, a).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		WebElement x = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		x.sendKeys("anil");
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();

		WebElement y = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));

		act.keyDown(y, Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
	}

}
