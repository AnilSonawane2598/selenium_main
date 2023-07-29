package sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo4 {// for last row and col

	public static void main(String[] args) throws IOException {
	
		String s="D:\\employee list.xlsx";
		FileInputStream file =new FileInputStream(s);
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();
	System.out.println(" last row no is-->"+rows);
		int cols=sheet.getRow(1).getLastCellNum();
		System.out.println("last cell no is -->"+cols);
	}

}
