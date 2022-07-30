package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitter {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(3000);
			WebElement username = driver.findElement(By.xpath("//input[@autocomplete='username']"));

		username.sendKeys("username1");
		
		WebElement next = driver.findElement(By.xpath("(//div[contains(@class,'css-901oao')])[7]"));
		next.click();
		Thread.sleep(5000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("password@123");
		
		WebElement login = driver.findElement(By.xpath("(//div[@dir='auto'])[9]"));
		login.click();
	}
}
