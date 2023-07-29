package All_selenium_class;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataall {

	@SuppressWarnings({ "resource", "incomplete-switch" })
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\DELL\\Documents\\namelmaneandmobiledata.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheetAt(0);

		int row = sheet.getLastRowNum();
		System.out.println(row);
		int col = sheet.getRow(1).getLastCellNum();
		System.out.println(col);

		for (int i = 0; i <= row; i++) {
			XSSFRow rows = sheet.getRow(i);

			for (int j = 0; j < col; j++) {
				XSSFCell cell = rows.getCell(j);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" || ");
			}
			System.out.println();
		}
	}

}
