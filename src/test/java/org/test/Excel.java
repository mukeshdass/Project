package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static String getData(int rowNo, int cellNo) throws Throwable {
		String v = null;
		File f = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		if (type == 1) {
			v = c.getStringCellValue();
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yy");
				v = sim.format(dateCellValue);
			} else {
				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;
				v = String.valueOf(l);
			}

		}
		return v;

	}
}