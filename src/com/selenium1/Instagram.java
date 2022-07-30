package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("robin@123");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Abc@123");
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.xpath("//*[@class='sqdOP  L3NKy   y3zKF     ']"));
		login.click();
	}
}
