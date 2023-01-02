package com.ts.package2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Configuration_Sales {
	protected RemoteWebDriver driver = null;

	@BeforeMethod
	public void managerLogin_Sales() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://qa-cnc.rameesystems.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("(//input[@name='identity'])[1]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Sales')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' New Sales']")).click();
		Thread.sleep(3000);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}

}
