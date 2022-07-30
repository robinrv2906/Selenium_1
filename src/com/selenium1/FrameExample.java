package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement btn1 = driver.findElement(By.id("Click"));
		btn1.click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement btn2 = driver.findElement(By.id("Click1"));
		btn2.click();
		System.out.println(btn2.getText());
		
		Thread.sleep(2000);
		driver.close();
	
		
	}


}
