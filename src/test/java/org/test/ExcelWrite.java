package org.test;

import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String iteamName, String itemPrice) throws Throwable {
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\excel\\Book1.xlsx");
		Workbook w = new XSSFWorkbook();

		Sheet s = w.createSheet("Sheet1");

		Row r = s.createRow(0);

		Cell c = r.createCell(0);

		c.setCellValue("Item Name");
		Cell c1 = r.createCell(1);
		c1.setCellValue("Price");

		Row r1 = s.createRow(1);

		Cell c2 = r1.createCell(0);
//		c2.setCellValue(text);

//		Cell c3 = r1.createCell(1);
//		c3.setCellValue(itemPrice);

		w.write(fos);
	}
}