package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/radio.html");
		WebElement select = driver.findElement(By.id("yes"));
		select.click();
		
		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"));
		WebElement checked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		
		boolean selected1 = unchecked.isSelected();
		boolean selected2 = checked.isSelected();
		
		System.out.println(selected1);
		System.out.println(selected2);
		
		WebElement below20 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		below20.click();
		
		
	}
}
