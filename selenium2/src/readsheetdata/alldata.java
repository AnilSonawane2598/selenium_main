package readsheetdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class alldata {

	public static void main(String[] args) throws IOException {


		String s="D:\\employee list.xlsx";
		FileInputStream file=new FileInputStream(s);
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
		int rows =sheet.getLastRowNum();
		System.out.println(rows);
		int col =sheet.getRow(1).getLastCellNum();
		System.out.println(col);
		
		for(int i=0;i<rows;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<col;j++) {
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
		FileInputStream file1=new FileInputStream(s);
		String s2=WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(s2);

	}
}
