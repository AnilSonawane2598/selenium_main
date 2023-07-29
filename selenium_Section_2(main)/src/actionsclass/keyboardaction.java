package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WbDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    WebElement user=driver.findElement(By.xpath("//input[@name=\"email\"]"));
	    WebElement pass=driver.findElement(By.xpath("//input[@name=\"pass\"]"));

	    Thread.sleep(4000);
	    user.sendKeys("anil1234");

	    Actions act=new Actions(driver);
	    
	    // ctrl+a
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("a");
	    act.keyUp(Keys.CONTROL);
	    act.perform();
	    
	    //ctrl+c
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("c");
	    act.keyUp(Keys.CONTROL);
	    act.build().perform();
	    
	    //tab
	    act.sendKeys(Keys.TAB);
	    act.build().perform();
	    
	    //ctrl+v
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("v");
	    act.keyUp(Keys.CONTROL);
	    act.build().perform();
	    	    	   
	    if(user.getAttribute("value").equals(pass.getAttribute("value"))) {
	    	System.out.println("correct text");
	    }
	    else {
	    	System.out.println("wrong text");
	    }
	    driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
	    
	 //   driver.quit();
	}

}
