package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Integration extends Excel {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MukeshDass\\eclipse-workspace\\Mukesh\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement uName = driver.findElement(By.id("email"));
		uName.sendKeys(getData(1, 0));
		String attribute2 = uName.getAttribute("value");
		System.out.println(attribute2);

		WebElement uPass = driver.findElement(By.id("pass"));
		uPass.sendKeys(getData(2, 1));

		String attribute = uPass.getAttribute("value");
		System.out.println(attribute);

	}

}
