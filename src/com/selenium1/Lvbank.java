package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lvbank {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		Thread.sleep(20000);
		
		WebElement username = driver.findElement(By.id("login_username|input"));
		username.sendKeys("robin@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("login_password|input"));
		password.sendKeys("Robin@123");
		
		WebElement login = driver.findElement(By.className("oj-button-label"));
		login.click();
		
	}

}
