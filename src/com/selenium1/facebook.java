package com.selenium1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("user@123");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("password@123");
		
		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
		Thread.sleep(5000);
		
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("hello");
		
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("hello");
		
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("1234567890");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\ScreenShot\\fb.png");
		FileUtils.copyFile(source, des);
		
		
	}

}
