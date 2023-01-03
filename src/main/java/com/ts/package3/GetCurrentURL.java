package com.ts.package3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GetCurrentURL {
	@Test
	public void currentUrl() throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.earningswhispers.com/");
		driver.findElement(By.xpath("//input[@placeholder='Ticker']")).sendKeys("adsk");
		driver.findElement(By.xpath("//input[@placeholder='Ticker']")).sendKeys(Keys.ENTER);
		String currentURL=driver.getCurrentUrl();
		String pageSource=driver.getPageSource();
		System.out.println("Current URL:"+currentURL);
		System.out.println("Page sourde:"+pageSource);
		

	}

}
