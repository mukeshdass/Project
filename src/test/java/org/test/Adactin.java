package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sorce = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\browser.png");
		FileUtils.copyFile(sorce, d);

		File loc = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\excel\\Project.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				String cellValue = c.getStringCellValue();
				if (cellValue.equals("DKGreens")) {
					driver.findElement(By.id("username")).sendKeys(cellValue);

					File sorce1 = ts.getScreenshotAs(OutputType.FILE);
					File d1 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\username.png");
					FileUtils.copyFile(sorce1, d1);
				} else if (cellValue.equals("greens")) {
					driver.findElement(By.id("password")).sendKeys(cellValue);

					File sorce2 = ts.getScreenshotAs(OutputType.FILE);
					File d2 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\password.png");
					FileUtils.copyFile(sorce2, d2);
				}
			}
		}
		driver.findElement(By.id("login")).click();

		File sorce3 = ts.getScreenshotAs(OutputType.FILE);
		File d3 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\login.png");
		FileUtils.copyFile(sorce3, d3);
		WebElement loca = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		Select refname = new Select(loca);
		refname.selectByIndex(5);

		File s1 = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\location.png");
		FileUtils.copyFile(s1, des);

		WebElement hot = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select refname1 = new Select(hot);
		refname1.selectByIndex(3);

		File s2 = ts.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\hotel.png");
		FileUtils.copyFile(s2, des1);

		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select refname2 = new Select(room);
		refname2.selectByIndex(4);

		File s3 = ts.getScreenshotAs(OutputType.FILE);
		File des2 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\room.png");
		FileUtils.copyFile(s3, des2);

		WebElement noroom = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select refname3 = new Select(noroom);
		refname3.selectByIndex(5);

		File s4 = ts.getScreenshotAs(OutputType.FILE);
		File des3 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\noroom.png");
		FileUtils.copyFile(s4, des3);

		WebElement dpick = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		dpick.clear();
		dpick.sendKeys("14/01/2020");

		File s5 = ts.getScreenshotAs(OutputType.FILE);
		File des4 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\checkIn.png");
		FileUtils.copyFile(s5, des4);

		WebElement dout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		dout.clear();
		dout.sendKeys("16/01/2020");

		File s6 = ts.getScreenshotAs(OutputType.FILE);
		File des5 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\checkOut.png");
		FileUtils.copyFile(s6, des5);

		WebElement adults = driver.findElement(By.id("adult_room"));
		Select refname6 = new Select(adults);
		refname6.selectByIndex(1);

		File s7 = ts.getScreenshotAs(OutputType.FILE);
		File des6 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\adult.png");
		FileUtils.copyFile(s7, des6);

		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select refname7 = new Select(child);
		refname7.selectByIndex(1);

		File s8 = ts.getScreenshotAs(OutputType.FILE);
		File des7 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\child.png");
		FileUtils.copyFile(s8, des7);

		driver.findElement(By.id("Submit")).click();

		File s9 = ts.getScreenshotAs(OutputType.FILE);
		File des8 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\submit.png");
		FileUtils.copyFile(s9, des8);

		WebElement rdobtn = driver.findElement(By.id("radiobutton_0"));
		rdobtn.click();

		File s10 = ts.getScreenshotAs(OutputType.FILE);
		File des9 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\rdobtn.png");
		FileUtils.copyFile(s10, des9);

		driver.findElement(By.id("continue")).click();

		File s11 = ts.getScreenshotAs(OutputType.FILE);
		File des10 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\continue.png");
		FileUtils.copyFile(s11, des10);

		// driver.findElement(By.id("cancel")).click();
		// File s12 = ts.getScreenshotAs(OutputType.FILE);
		// File des11 = new
		// File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\cancel.png");
		// FileUtils.copyFile(s12, des11);

		for (int k = 0; k < s.getPhysicalNumberOfRows(); k++) {
			Row r = s.getRow(k);
			for (int l = 0; l < r.getPhysicalNumberOfCells(); l++) {
				Cell c = r.getCell(l);
				String cellValue = c.getStringCellValue();
				if (cellValue.equals("mukesh")) {
					driver.findElement(By.id("first_name")).sendKeys(cellValue);

					File sorce1 = ts.getScreenshotAs(OutputType.FILE);
					File d1 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\fname.png");
					FileUtils.copyFile(sorce1, d1);

				} 
				else if (cellValue.equals("dass")) {
					driver.findElement(By.id("last_name")).sendKeys(cellValue);

					File sorce1 = ts.getScreenshotAs(OutputType.FILE);
					File d1 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\lname.png");
					FileUtils.copyFile(sorce1, d1);

				} 
				else if (cellValue.equals("no8, pilliyar kovi street")) {
					driver.findElement(By.id("address")).sendKeys(cellValue);

					File sorce1 = ts.getScreenshotAs(OutputType.FILE);
					File d1 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\address.png");
					FileUtils.copyFile(sorce1, d1);
				}

				WebElement cc = driver.findElement(By.id("cc_num"));
				cc.sendKeys("4450694261705278");
				
				File sorce1 = ts.getScreenshotAs(OutputType.FILE);
				File d1 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\address.png");
				FileUtils.copyFile(sorce1, d1);
				
				WebElement ccType = driver.findElement(By.id("cc_type"));
				Select cType = new Select(ccType);
				cType.selectByIndex(2);
				
				File ss = ts.getScreenshotAs(OutputType.FILE);
				File ds = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\cc.png");
				FileUtils.copyFile(ss, ds);
				
				WebElement em = driver.findElement(By.id("cc_type"));
				Select emon = new Select(ccType);
				emon.selectByIndex(5);
				
			
				File ss1 = ts.getScreenshotAs(OutputType.FILE);
				File ds1 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\em.png");
				FileUtils.copyFile(ss1, ds1);
				
				WebElement ey = driver.findElement(By.id("cc_type"));
				Select eYear = new Select(ccType);
				eYear.selectByIndex(4);
				
				File ss2 = ts.getScreenshotAs(OutputType.FILE);
				File ds2 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\ey.png");
				FileUtils.copyFile(ss2, ds2);
				
				driver.findElement(By.id("cc_cvv")).sendKeys("175");
				

				File ss3 = ts.getScreenshotAs(OutputType.FILE);
				File ds3 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\cvv.png");
				FileUtils.copyFile(ss3, ds3);
				
				driver.findElement(By.id("book_now")).clear();
				
				File ss4 = ts.getScreenshotAs(OutputType.FILE);
				File ds4 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\book.png");
				FileUtils.copyFile(ss4, ds4);
				
			}

		}

	}
}
