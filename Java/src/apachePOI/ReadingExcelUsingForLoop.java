package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcelUsingForLoop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		File f = new File("H:\\Documents\\POIExcel.xlsx");
		FileInputStream fi = new FileInputStream(f);
		
		Workbook workbook = WorkbookFactory.create(fi);
		Sheet sheet0 = workbook.getSheetAt(0);
		
		for(Row row : sheet0)
		{
			for(Cell cell : row)
			{
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getRichStringCellValue()+ "\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue()+ "\t");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.println("Blank Cell"+ "\t");
					break;
				}
				
			}
		}
		
		
		fi.close();
	}

}
