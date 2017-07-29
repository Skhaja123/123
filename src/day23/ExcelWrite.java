package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\ExcelRead.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r = ws.getRow(0);
		Cell c = r.getCell(1);
		c.setCellValue("ABCD");
		
		r=ws.getRow(1);
		c=r.createCell(4);
		c.setCellValue("SAK");
		
		r= ws.createRow(4);
		c=r.createCell(1);
		c.setCellValue("1234");
		
		FileOutputStream f = new FileOutputStream("E:\\ExcelRead.xlsx");
		wb.write(f);
		
	}

}
