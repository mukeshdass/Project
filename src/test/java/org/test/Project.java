package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Project extends BaseClass {

	public static void main(String[] args) throws Throwable {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		// Launching the browser
		driver.get("https://bookoutlet.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Browser Screenshot
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\browserlaunch.png");
		FileUtils.copyFile(s, d);
		// search iteam
		WebElement search = driver.findElement(By.id("q"));
		search.sendKeys("book");

		// search iteam ss
		File s1 = ts.getScreenshotAs(OutputType.FILE);
		File d1 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\searchbook.png");
		FileUtils.copyFile(s1, d1);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		File s2 = ts.getScreenshotAs(OutputType.FILE);
		File d2 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\enter.png");
		FileUtils.copyFile(s2, d2);
		// scroll down
		Thread.sleep(3000);
		WebElement scroll = driver.findElement(By.xpath("//strong[text()='49% off']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		// scroll down screen shot
		File s3 = ts.getScreenshotAs(OutputType.FILE);
		File d3 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\scroll.png");
		FileUtils.copyFile(s3, d3);

		// add to cart
		WebElement addcart = driver.findElement(By.xpath("(//button[@type='submit'])[19]"));
		js.executeScript("arguments[0].click()", addcart);

		// add to cart screen shot
		File s4 = ts.getScreenshotAs(OutputType.FILE);
		File d4 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\addcart.png");
		FileUtils.copyFile(s4, d4);

		driver.findElement(By.xpath("(//span[@class='fa fa-shopping-cart fa-lg'])[2]")).click();

		File s5 = ts.getScreenshotAs(OutputType.FILE);
		File d5 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\addcartclick.png");
		FileUtils.copyFile(s5, d5);
		// scroll down in chekout page
		WebElement scroll1 = driver.findElement(By.xpath("//h1[text()='Others Also Bought']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scroll1);

		driver.findElement(By.id("btnCheckout")).click();

		File s6 = ts.getScreenshotAs(OutputType.FILE);
		File d6 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\checkout.png");
		FileUtils.copyFile(s6, d6);

		// enter email to buy a book
		WebElement email = driver.findElement(By.name("UserName"));
		email.sendKeys("mukeshdass@gmail.com");

		// email ss
		File s7 = ts.getScreenshotAs(OutputType.FILE);
		File d7 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\email.png");
		FileUtils.copyFile(s7, d7);

		// enter password to buy a book
		WebElement pass = driver.findElement(By.name("Password"));
		pass.sendKeys("Amma@12345");

		// password ss
		File s8 = ts.getScreenshotAs(OutputType.FILE);
		File d8 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\password.png");
		FileUtils.copyFile(s8, d8);

		// submit button
		driver.findElement(By.name("btnSubmit")).click();

		// submit button ss
		File s9 = ts.getScreenshotAs(OutputType.FILE);
		File d9 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\submit.png");
		FileUtils.copyFile(s9, d9);
		// add close
		driver.findElement(By.xpath("//span[text()='×']")).click();

		File s10 = ts.getScreenshotAs(OutputType.FILE);
		File d10 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\submit.png");
		FileUtils.copyFile(s10, d10);

		// get all text in checkout page
		WebElement item = driver.findElement(By.xpath("(//div[@class='col-xs-8 col-md-5'])[1]"));
		String text = item.getText();
		System.out.println(text);

		File s11 = ts.getScreenshotAs(OutputType.FILE);
		File d11 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\iteamdet.png");
		FileUtils.copyFile(s11, d11);

		WebElement quantity = driver
				.findElement(By.xpath("(//div[@class='col-xs-6 col-md-2 text-center hidden-xs'])[1]"));
		String quan = quantity.getText();
		System.out.println(quan);

		File s12 = ts.getScreenshotAs(OutputType.FILE);
		File d12 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\quantity.png");
		FileUtils.copyFile(s12, d12);

		WebElement price = driver.findElement(By.xpath("(//div[@class='col-xs-6 col-md-2 sku-pricing'])[1]"));
		String pri = price.getText();
		System.out.println(pri);

		File s13 = ts.getScreenshotAs(OutputType.FILE);
		File d13 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\price.png");
		FileUtils.copyFile(s13, d13);

		WebElement total = driver.findElement(By.xpath("(//div[@class='col-xs-6 col-md-2 sku-subtotal'])[1]"));
		String tot = total.getText();
		System.out.println(tot);

		File s14 = ts.getScreenshotAs(OutputType.FILE);
		File d14 = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\total.png");
		FileUtils.copyFile(s14, d14);

		// order details print in excel sheet

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\excel\\Project.xlsx");
		Workbook w = new XSSFWorkbook();

		Sheet sh = w.createSheet("Sheet2");

		Row ro = sh.createRow(0);

		Cell c = ro.createCell(0);
		c.setCellValue("Item Name");

		Cell c1 = ro.createCell(1);
		c1.setCellValue("Quantity");

		Cell c2 = ro.createCell(2);
		c2.setCellValue("Price");

		Cell c3 = ro.createCell(3);
		c3.setCellValue("Total");

		Row r1 = sh.createRow(2);
		Cell c4 = r1.createCell(0);
		c4.setCellValue(text);

		Row r2 = sh.createRow(3);
		Cell c5 = r1.createCell(1);
		c5.setCellValue(quan);

		Row r3 = sh.createRow(4);
		Cell c6 = r1.createCell(2);
		c6.setCellValue(pri);

		Row r4 = sh.createRow(5);
		Cell c7 = r1.createCell(3);
		c7.setCellValue(tot);

		w.write(fos);
	}
}
