package apachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
		//Create Excel workbook using POI
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//Create sheets in workbook
		XSSFSheet sheet0 = workbook.createSheet("First Sheet");
		
		//Create rows in sheet
		Row row0 = sheet0.createRow(0);
		
		//Create cells in sheet
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		//Give values to the above created cells
		cellA.setCellValue("First Cell");
		cellB.setCellValue("Second Cell");
		
		//Connecting Streams
		File f = new File("H:\\Documents\\POIExcel.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		
		workbook.write(fo);
		
		//closing the stream
		workbook.close();
		
		System.out.println("File created...");

	}

}
