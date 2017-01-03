package apachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelUsingForLoop {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("First sheet");

		for(int rows=0; rows<10; rows++)
		{
			Row row = sheet0.createRow(rows);
					for(int cols=0; cols<10; cols++)
					{
						Cell cell = row.createCell(cols);
						cell.setCellValue((int)(Math.random()*100));
					}
		}

		//Connecting Streams
		File f = new File("H:\\Documents\\POIExcel.xlsx");
		FileOutputStream fo = new FileOutputStream(f);

		workbook.write(fo);

		//closing the stream
		workbook.close();

		System.out.println("File created...");
	}

}
