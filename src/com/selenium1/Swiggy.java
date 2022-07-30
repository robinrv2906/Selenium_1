package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys("chennai");
		
		WebElement find = driver.findElement(By.xpath("//*[text()='FIND FOOD']"));
		find.click();
		
		
	}

}
