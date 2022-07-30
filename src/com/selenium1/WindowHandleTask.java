package com.selenium1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class WindowHandleTask {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		Thread.sleep(3000);

		Robot robo = new Robot();

		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("amazon.com");
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		WebElement amazon = driver.findElement(By.xpath("//h3[text()='Amazon.com. Spend less. Smile more.']"));
		amazon.click();
		Thread.sleep(5000);

		WebElement btn = driver.findElement(By.xpath("//input[@data-action-type='DISMISS']"));
		btn.click();
		Thread.sleep(5000);

		Actions a = new Actions(driver);

		WebElement giftCard = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[5]"));
		a.contextClick(giftCard).build().perform();
		Thread.sleep(5000);

		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
		a.contextClick(sell).build().perform();
		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		WebElement customer_service = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		a.contextClick(customer_service).build().perform();
		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		int size = driver.getWindowHandles().size();
		System.out.println("All window count :" + size);

		System.out.println("******************************************************************************");
		String PW = driver.getWindowHandle();
		System.out.println(PW);
		System.out.println("******************************************************************************");

		Set<String> allwindow = driver.getWindowHandles();
		for (String cp : allwindow) {
			String title = driver.switchTo().window(cp).getTitle();
			System.out.println("all window title :" + title);

		}

		String actual_title = "Amazon.com: Sell Products Online with Selling on Amazon.";
		for (String cp : allwindow) {
			if (driver.switchTo().window(cp).getTitle().equals(actual_title))
				break;
		}

		WebElement search1 = driver.findElement(By.id("twotabsearchtextbox"));
		search1.sendKeys("Samsung Galaxy S22 Ultra 5G");
		WebElement enterBtn = driver.findElement(By.id("nav-search-submit-button"));
		enterBtn.click();
		Thread.sleep(2000);

		WebElement search2 = driver.findElement(By.xpath("//img[@data-image-index='1']"));
		search2.click();
		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\ScreenShot\\samsung.png");
		FileHandler.copy(source, dest);

		String actual_title1 = "Amazon.com Gift Cards";
		for (String cp : allwindow) {
			if (driver.switchTo().window(cp).getTitle().equals(actual_title1))
				break;
		}
		
		WebElement search3 = driver.findElement(By.id("twotabsearchtextbox"));
		search3.sendKeys("IPhone 13 pro max");
		WebElement enter_btn = driver.findElement(By.id("nav-search-submit-button"));
		enter_btn.click();
		Thread.sleep(2000);
		
		WebElement img = driver.findElement(By.xpath("//img[@data-image-index='1']"));
		img.click();
		Thread.sleep(2000);
		
		File source1 =ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\ScreenShot\\iphone.png");
		FileUtils.copyFile(source1, destination);
		
		for (String cp : allwindow) {
			if (!cp.equals(PW)) {
				driver.switchTo().window(cp);
				driver.close();
			}
		}

	}


}
