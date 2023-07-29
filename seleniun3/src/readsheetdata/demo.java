package readsheetdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String s="D:\\study schedule daily.xlsx";
	FileInputStream file =new FileInputStream(s);
String s1=	WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(s1);
	
	FileInputStream file1 =new FileInputStream(s);
	XSSFWorkbook book=new XSSFWorkbook(file1);
	XSSFSheet sheet=book.getSheetAt(0);
	int a=sheet.getLastRowNum();
	System.out.println(a);
	int b=sheet.getRow(0).getLastCellNum();
	System.out.println(b);
	
	for(int i=0;i<a;i++) {
		XSSFRow row=sheet.getRow(i);
		for(int j=0;j<b;j++) {
			XSSFCell cell=row.getCell(j);
				switch(cell.getCellType()) {
				case STRING:System.out.print(cell.getStringCellValue());
				break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());
				break;
			}
				System.out.print("  ||  ");
		}
		System.out.println();
	}
	}
	
}
