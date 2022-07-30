package com.selenium1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutordemo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		//position scroll down and scroll up
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000);"); 
		Thread.sleep(2000);
		
		//scroll bottom of the page
		js.executeScript("window.scroll(0,document.body.scrollHeight)","");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,0)","");
		Thread.sleep(2000);
		
		driver.close();
	}

}
