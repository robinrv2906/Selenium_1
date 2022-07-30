package com.selenium1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleDemo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		WebElement btn = driver.findElement(By.xpath("//input[@data-action-type='DISMISS']"));
		btn.click();
		Thread.sleep(5000);
		
		Actions a = new Actions(driver);
		
		WebElement giftCard = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[5]"));
		a.contextClick(giftCard).build().perform();
		Thread.sleep(5000);
		
		Robot robo=new Robot();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		
		robo.keyPress(KeyEvent.VK_PAGE_UP);
		robo.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(5000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		//2nd window
		WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
		a.contextClick(sell).build().perform();
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		//3rd  window
		WebElement customer_service = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		a.contextClick(customer_service).build().perform();
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		//for getting window size
		int size = driver.getWindowHandles().size();
		System.out.println("All window count :"+size);
		
		
		System.out.println("***********************************************************************************");
		//parent window name
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		System.out.println("*************************************************************************************");
		
		//getting title for all window
		Set<String> allwind = driver.getWindowHandles();
		for (String cp : allwind) {
			String title = driver.switchTo().window(cp).getTitle();
			System.out.println(title);
		}
		
		String actual_title = "Amazon.com Gift Cards";
		for (String cp : allwind) {
			if(driver.switchTo().window(cp).getTitle().equals(actual_title)) {
				break;
			}
		}
			
		
			
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Iphone");
		WebElement enter_btn = driver.findElement(By.id("nav-search-submit-button"));
		enter_btn.click();
		
		for (String cp : allwind) {
			if(!cp.equals(pw)) {
				driver.switchTo().window(cp);
				driver.close();
			}
		}
		
		
		}
		
}
