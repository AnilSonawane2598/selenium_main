package readexcelldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class specificdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("WebDriver.chrome.driver","\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		String s="C:\\Users\\DELL\\eclipse-workspace\\selenium_practic_section_2\\exceldata\\employee list.xlsx";
		FileInputStream file=new FileInputStream(s);
	String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);

		
		// for paste data in Website
//	String data1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
//	driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(data1);
	}

}
