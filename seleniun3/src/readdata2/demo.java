package readdata2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// read data from excel specific
		String s="C:\\Users\\DELL\\eclipse-workspace\\seleniun3\\screenshot\\study schedule daily.xlsx";
		FileInputStream file=new FileInputStream(s);
	String s1=	WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	System.out.println(s1);
	
	System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(s1);
	
	}

}
