package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		WebElement home = driver.findElement(By.id("home"));
		home.click();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		WebElement position = driver.findElement(By.id("position"));
		Point location = position.getLocation();
		System.out.println(location);
		
		WebElement color = driver.findElement(By.id("color"));
		int hashCode = color.hashCode();
		System.out.println(hashCode);
		
		WebElement size = driver.findElement(By.id("size"));
		Dimension size2 = size.getSize();
		System.out.println(size2);
		
		
	
	}

}
