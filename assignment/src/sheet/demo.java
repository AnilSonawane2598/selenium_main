package sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo { // print specific data

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	String s="D:\\employee list.xlsx";
	FileInputStream file =new FileInputStream(s);
	// fetch single data hr manager
	String data= WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
     System.out.println(data);

	}
}
