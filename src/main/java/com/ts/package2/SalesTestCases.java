package com.ts.package2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SalesTestCases extends Configuration_Sales{
	
	@Test(priority=1,invocationCount=0)
	public void submitButton_TC01() {
		driver.findElement(By.xpath("//input[@name='start_date']")).sendKeys("20-12-2022");
		driver.findElement(By.xpath("//input[@name='end_date']")).sendKeys("24-12-2022");
		driver.findElement(By.xpath("//button[text()=' Submit']")).click();

	}
	@Test(priority=3,enabled=false)
	public void showButton_TC02() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='select2-choice']")).click();
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]")).click();
		Thread.sleep(2000);
		

	}
	
	@Test(priority=2,enabled=false)
	public void searchBox() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='input-xs'])[3]")).sendKeys("jignesh");
		Thread.sleep(2000);
	}
	
	@Test
	public void actionsButton() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='input-xs'])[3]")).sendKeys("flower");
		driver.findElement(By.xpath("//tbody[@role='alert']/descendant::ins")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@data-placement='left']")).click();
		driver.findElement(By.xpath("//a[@data-action='combine']")).click();
		Thread.sleep(2000);

	}

}
