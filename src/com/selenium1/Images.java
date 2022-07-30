package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		WebElement img = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		img.click();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		WebElement brokenimg = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		boolean displayed = brokenimg.isEnabled();
		System.out.println(displayed);
	}

}
