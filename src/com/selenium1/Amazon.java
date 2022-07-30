package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_833o4zmtnn_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=17319291380801953787&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061929&hvtargid=kwd-326600735004&hydadcr=5840_1914862&gclid=EAIaIQobChMIp-bdzbeO-AIViphmAh28aQR8EAAYASAAEgKpxPD_BwE");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung galaxy a53");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
	}

}
