package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("WbDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		WebElement source = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		WebElement dest = driver.findElement(By.xpath("//div[text()='United States']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(source, dest).build().perform();

	}

}
