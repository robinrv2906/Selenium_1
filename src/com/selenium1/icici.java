package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icici {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		Thread.sleep(3000);
		
		WebElement username1 = driver.findElement(By.name("DUMMY1"));
		username1.click();
		
		WebElement username = driver.findElement(By.xpath("(//input[@onkeypress='return checkEnter(event);'])[3]"));
		username.sendKeys("username@123");
		
		Thread.sleep(5000);
		
		WebElement password = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		password.sendKeys("Password@123");
		
		WebElement login_btn = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		login_btn.click();
		
	}

}
