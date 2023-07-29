package parametarizationfetchfromexcelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="D:\\1. VELOCITY CLASS FILE FOR AUTOMATIN TESTING\\2. SELINEUM\\read data through Apache POI in selenium.xlsx";

		FileInputStream file =new FileInputStream(path);
		
		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(9).getCell(12).getStringCellValue();
		System.out.println(data);
	}

}
