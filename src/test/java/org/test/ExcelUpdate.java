package org.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUpdate {
public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\excel\\Book2.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Mukesh");
		Row r = s.getRow(6);
		Cell c = r.getCell(4);
		c.setCellValue("malar");
		FileOutputStream o = new FileOutputStream(f);
		w.write(o);
		System.out.println("updated successfully");
}
}
