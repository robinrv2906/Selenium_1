package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("example@123");
		
		WebElement default1 = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		System.out.println(default1.getText());
		
		WebElement cleartext = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		cleartext.clear();
		
		WebElement disabled = driver.findElement(By.xpath("//*[@disabled='true']"));
		boolean enabled = disabled.isEnabled();
		System.out.println(enabled);
		
	}
}
