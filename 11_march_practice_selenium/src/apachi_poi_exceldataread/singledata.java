package apachi_poi_exceldataread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class singledata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String s="C:\\Users\\DELL\\eclipse-workspace\\11_march_practice_selenium\\excelsheet\\employee list.xlsx";
		FileInputStream file=new FileInputStream(s);
	    String data=	WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    System.out.println(data);
	
	}

}
