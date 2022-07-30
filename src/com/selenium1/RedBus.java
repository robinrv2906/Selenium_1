package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		WebElement from = driver.findElement(By.className("db"));
		from.sendKeys("chennai");

		Thread.sleep(2000);

		WebElement tobox = driver.findElement(By.id("dest"));
		tobox.sendKeys("trichy");
		
		WebElement date = driver.findElement(By.id("onward_cal"));
		date.click();
	

	}

}
