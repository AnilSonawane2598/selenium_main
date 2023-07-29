package readdata2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		String s="C:\\Users\\DELL\\eclipse-workspace\\seleniun3\\screenshot\\study schedule daily.xlsx";
		FileInputStream file=new FileInputStream(s);
	String s1=	WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	System.out.println(s1);
	}

}
