package com.selenium1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		Actions actions=new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		actions.moveToElement(women).build().perform();
		
		Thread.sleep(2000);
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		tshirt.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		WebElement img = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", img);
		img.click();
		
		Thread.sleep(8000);
		
		driver.switchTo().frame(0);
		
		WebElement thumb2 = driver.findElement(By.id("thumb_2"));
		actions.moveToElement(thumb2).build().perform();
		
		WebElement thumb3 = driver.findElement(By.id("thumb_3"));
		actions.moveToElement(thumb3).build().perform();
		
		WebElement thumb4 = driver.findElement(By.id("thumb_4"));
		actions.moveToElement(thumb4).build().perform();
		
		
		
		WebElement quantity = driver.findElement(By.id("quantity_wanted"));
		quantity.clear();
		quantity.sendKeys("2");
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select select = new Select(size);
		select.selectByValue("1");
		
		WebElement color = driver.findElement(By.id("color_14"));
		actions.moveToElement(color).click().build().perform();
		
		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(10000);
		
		WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		proceed.click();
		
		WebElement proceed2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed2.click();
		
		executor.executeScript("window.scroll(0,450)", "");
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("automationpracticeuser7@gmail.com");
		
		WebElement createAccount = driver.findElement(By.id("SubmitCreate"));
		createAccount.click();
		
		Thread.sleep(7000);
		
		WebElement mr = driver.findElement(By.name("id_gender"));
		mr.click();
		
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys("James");
		
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		lastName.sendKeys("William");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("password@123");
		
		WebElement days = driver.findElement(By.id("days"));
		Select select1=new Select(days);
		select1.selectByIndex(1);
		
		WebElement months = driver.findElement(By.id("months"));
		Select select2= new Select(months);
		select2.selectByVisibleText("January ");
		
		WebElement years = driver.findElement(By.id("years"));
		Select select3=new Select(years);
		select3.selectByValue("2022");
		
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("1234/76");
		
		WebElement address1 = driver.findElement(By.id("address2"));
		address1.sendKeys("North Croft Avenue");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Los Angeles");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select select4 = new Select(state);
		select4.selectByValue("5");
		
		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("90011");
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select select5 = new Select(country);
		select5.selectByValue("21");
		
		WebElement mobileNo = driver.findElement(By.id("phone_mobile"));
		mobileNo.sendKeys("+14148929343");
		
		WebElement alias = driver.findElement(By.id("alias"));
		alias.clear();
		alias.sendKeys("Menlo Park, California");
		
		WebElement register = driver.findElement(By.id("submitAccount"));
		register.click();
		
		WebElement proceed1 = driver.findElement(By.name("processAddress"));
		proceed1.click();
		
		WebElement agree = driver.findElement(By.id("cgv"));
		agree.click();
		
		WebElement process = driver.findElement(By.name("processCarrier"));
		process.click();
		
		WebElement confirm = driver.findElement(By.className("cheque"));
		confirm.click();
		
		executor.executeScript("window.scrollBy(0,600)", "");
		
		WebElement confirm_btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm_btn.click();
		
		WebElement order = driver.findElement(By.xpath("//h1[text()='Order confirmation']"));
		executor.executeScript("arguments[0].scrollIntoView(true);",order);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\ScreenShot\\shopping.png");
		FileUtils.copyFile(source, dest);
		
		Thread.sleep(5000);
		WebElement backToOrder = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		
		WebElement history = driver.findElement(By.xpath("//td[@class='history_link bold footable-first-column']"));
		history.click();
		
		WebElement header = driver.findElement(By.xpath("//p[@class='info-title']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", header);
		
		WebElement receipt = driver.findElement(By.xpath("//a[text()='Download your invoice as a PDF file.']"));
		receipt.click();
		
	}

}
