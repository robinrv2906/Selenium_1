package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement username= driver.findElement(By.xpath("//*[@data-testid='royal_email']"));
		username.sendKeys("8056813870");
		
		WebElement password=driver.findElement(By.xpath("//*[@placeholder='Password']"));
		password.sendKeys("robin@123");
		
		WebElement log_in=driver.findElement(By.xpath("//*[@data-testid='royal_login_button']"));
		log_in.click();
		
		
	}
}
