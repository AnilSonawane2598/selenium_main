package apachi_poi_exceldataread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class alldataread {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String s="C:\\Users\\DELL\\eclipse-workspace\\11_march_practice_selenium\\excelsheet\\employee list.xlsx";
		FileInputStream file=new FileInputStream(s);
	   XSSFWorkbook book=new XSSFWorkbook(file);
	   XSSFSheet sheet=book.getSheetAt(0);
	   
	   int rows=sheet.getLastRowNum();
	   System.out.println(rows);
	   
	   int cols=sheet.getRow(0).getLastCellNum();
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
				   case BOOLEAN:System.out.print(cell.getBooleanCellValue());
				   break;
				   }
				   System.out.print("  ||  ");
			   }
			   System.out.println();
		   }
	}

}
