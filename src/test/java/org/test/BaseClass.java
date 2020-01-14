package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	static WebDriver driver;

	public static WebDriver browserLanuch(String parameter) {
		if(parameter.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (parameter.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
				}
		else if (parameter.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void loadUrl(String u) {
		driver.get(u);
	}

	public static void screenShot(String value) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\ScreenShot\\" + value + ".png");
		FileUtils.copyFile(s, d);
	}

	public static void scroll(WebElement value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", value);
	}
	public static void text(WebElement parameter , String value) {
		parameter.sendKeys(value);
	}
	
	
}
