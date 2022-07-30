package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		WebElement java = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		java.click();
		
		WebElement selenium = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		boolean selected = selenium.isSelected();
		System.out.println(selected);
		
		WebElement deselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		if (deselect.isSelected()) {
			deselect.click();
		}
		
		WebElement desElement1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		if (desElement1.isSelected()) {
			desElement1.click();
		}
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[3]")).click();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[4]")).click();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[5]")).click();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[6]")).click();
	}
}
