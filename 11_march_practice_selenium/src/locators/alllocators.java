package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllocators {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// relative xpath
		// xpath by attribute
		driver.findElement(By.xpath("//input[@name=\"email\"]"));
		//by name
		driver.findElement(By.name("email"));
		// by id
		driver.findElement(By.id("email"));
		//by classname
		driver.findElement(By.className("inputtext _55r1 _6luy"));
		// by tagname
		driver.findElement(By.tagName("input"));
		// by linktext
		driver.findElement(By.linkText("Log in"));
		//by partiallinktext
		driver.findElement(By.partialLinkText("Log in"));
		// xpath by text
		driver.findElement(By.xpath("//button[text()='Log in']"));
		//xpath by contains by text
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		//xpath contains by attribute
		driver.findElement(By.xpath("//button[contains(@value,\"1\")]"));
		// xpath by index
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		// absoulute xpath
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));

		
	}

}
