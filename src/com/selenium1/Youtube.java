package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("vikram trailer");
		WebElement search1 = driver.findElement(By.id("search-icon-legacy"));
		search1.click();
		WebElement s2 = driver.findElement(By.xpath("//*[contains(text(),'VIKRAM')]"));
		s2.click();
	}
}
