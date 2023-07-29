package readsheetdata2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo3 {

	public static void main(String[] args) throws IOException {


		String s="D:\\employee list.xlsx";
		FileInputStream file =new FileInputStream(s);
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		int cols=sheet.getRow(1).getLastCellNum();
		System.out.println(cols);
		
		for(int i=0;i<rows;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<cols;j++) {
				XSSFCell cell=row.getCell(j);
				switch(cell.getCellType()) {
				case STRING:System.out.print(cell.getStringCellValue());
				break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				break;
				case BOOLEAN:System.out.println(cell.getBooleanCellValue());
				break;
				}
				System.out.print("  ||  ");
				}
			System.out.println();
		}
	}

}
