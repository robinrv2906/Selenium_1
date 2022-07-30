package com.selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Alert.html");
		
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmbox.click();
		Alert conm=driver.switchTo().alert();
		conm.dismiss();
		
		WebElement prombtbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		prombtbox.click();
		Alert prombt=driver.switchTo().alert();
		prombt.sendKeys("Duckling");
		prombt.accept();
		
		WebElement breakline = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button"));
		breakline.click();
		Alert linebrkup=driver.switchTo().alert();
		linebrkup.accept();
	}

}
