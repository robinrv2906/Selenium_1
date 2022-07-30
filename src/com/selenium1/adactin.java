package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactin {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("robin@123");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("robin@123");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

}
