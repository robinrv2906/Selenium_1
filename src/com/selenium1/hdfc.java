package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class hdfc {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(5000);

		WebElement userid = driver.findElement(By.xpath("//input[@type='text']"));
		userid.sendKeys("wrrette");
		
		WebElement cont = driver.findElement(By.className("btn btn-primary login-btn"));
		cont.click();

	}
}
