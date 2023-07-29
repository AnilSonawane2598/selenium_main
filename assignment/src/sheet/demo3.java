package sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo3 {  // number of sheets in the excel


	public static void main(String[] args) throws IOException {
		String s="D:\\employee list.xlsx";
		FileInputStream file =new FileInputStream(s);
		
		Workbook book =WorkbookFactory.create(new File(s));
	    // number of sheets in the Workbook
	    System.out.println("Workbook has " + book.getNumberOfSheets() + " Sheets : ");
	  

	}
	 

}