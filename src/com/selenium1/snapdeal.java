package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("1234567890");
		
		WebElement login = driver.findElement(By.id("checkUser"));
		login.click();
	}
}
