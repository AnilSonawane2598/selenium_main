package readsheetdata2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		String s="C:\\Users\\DELL\\eclipse-workspace\\selenium2\\data\\employee list.xlsx";
		FileInputStream file =new FileInputStream(s);
		String s1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(4).getStringCellValue();
		System.out.println(s1);
	}

}
