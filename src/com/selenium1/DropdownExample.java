package com.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class DropdownExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropdown1);
		select.selectByIndex(1);
		
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select select1=new Select(dropdown2);
		select1.selectByVisibleText("Appium");
		
		WebElement dropdown3 = driver.findElement(By.name("dropdown3"));
		Select select3=new Select(dropdown3);
		select3.selectByValue("3");
		
		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select select4=new Select(dropdown4);
		List<WebElement> numoption = select4.getOptions();
		int size = numoption.size();
		System.out.println(size);
		
		WebElement dropdown5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multi=new Select(dropdown5);
		boolean mul=multi.isMultiple();
		System.out.println(mul);
		multi.selectByIndex(1);
		multi.selectByIndex(2);
		multi.selectByIndex(3);
		multi.selectByIndex(4);
		

	}

}
