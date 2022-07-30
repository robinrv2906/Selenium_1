package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class irctc {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(10000);

		WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		btn.click();
		
		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		from.sendKeys("chennai");
		
		WebElement tobox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		tobox.sendKeys("cuddalore");
		
		WebElement rev = driver.findElement(By.className("ng-tns-c66-12 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted"));
		Select s = new Select(rev);
		s.selectByIndex(1);
	}
}
