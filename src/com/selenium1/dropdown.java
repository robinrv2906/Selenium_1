package com.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://ironspider.ca/forms/dropdowns.htm#howtheywork");

		     WebElement cofe  = driver.findElement(By.name("coffee2"));
		Select s = new Select(cofe);
		s.selectByValue("milk2");
		s.selectByValue("whipped");
		s.selectByValue("honey");
		s.selectByValue("donut");
		s.selectByValue("muffin");

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}

		List<WebElement> getoptions = s.getOptions();
		for (WebElement webElement1 : getoptions) {
			System.out.println(webElement1.getText());
		}
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

}
