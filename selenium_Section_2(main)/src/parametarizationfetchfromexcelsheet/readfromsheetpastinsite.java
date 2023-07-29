package parametarizationfetchfromexcelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readfromsheetpastinsite {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
String s="D:\\INSTALLER FILE\\studentlist.xlsx";
		FileInputStream file=new FileInputStream(s);
		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(data);
	
	FileInputStream file1=new FileInputStream(s);
//	XSSFWorkbook work=new XSSFWorkbook(file1);
	String data1=WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	System.out.println(data1);
	
	System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("email")).sendKeys(data);
	driver.findElement(By.id("pass")).sendKeys(data1);
	
	
}
}