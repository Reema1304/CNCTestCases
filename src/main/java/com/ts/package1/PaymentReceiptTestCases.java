package com.ts.package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PaymentReceiptTestCases extends Configuration_PaymentRec {

	@Test(priority=1,enabled=false)
	public void selectCustomer_TC01() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();
		WebElement typeName = driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']"));
		typeName.sendKeys("jig");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@role='option'])[1]")).click();
		Thread.sleep(4000);

	}

	@Test(priority=2,enabled=false)
	public void SelectDate_TC02() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();
		WebElement typeName = driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']"));
		typeName.sendKeys("jig");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@role='option'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='form-control date']")).sendKeys("24-12-2022");
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//input[@name='date']")).click();

	}

	@Test(priority=3,enabled=false)
	public void amount_TC03() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();
		WebElement typeName = driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']"));
		typeName.sendKeys("jig");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@role='option'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='form-control date']")).sendKeys("24-12-2022");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='amount-paid']")).sendKeys("1000");
		Thread.sleep(4000);

	}

	@Test(priority=4,enabled=false)
	public void payingBy_TC04() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();
		WebElement typeName = driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']"));
		typeName.sendKeys("jig");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@role='option'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='form-control date']")).sendKeys("24-12-2022");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='amount-paid']")).sendKeys("1000");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Select Payment Type']")).click();
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[4]")).click();
		Thread.sleep(4000);

	}

	@Test(priority=5,enabled=false)
	public void reference_TC05() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();
		WebElement typeName = driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']"));
		typeName.sendKeys("jig");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@role='option'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='form-control date']")).sendKeys("24-12-2022");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='amount-paid']")).sendKeys("1000");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Select Payment Type']")).click();
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='reference_no']")).sendKeys("ref001");
		Thread.sleep(4000);

	}

	@Test(priority=6,enabled=false)
	public void submit_TC06() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();
		WebElement typeName = driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']"));
		typeName.sendKeys("jig");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@role='option'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='form-control date']")).sendKeys("24-12-2022");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='amount-paid']")).sendKeys("1000");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Select Payment Type']")).click();
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='reference_no']")).sendKeys("ref001");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='add_payment']")).click();
		Thread.sleep(4000);

	}

	@Test(priority=7)
	public void allocatePayment_Yes_TC07() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();
		WebElement typeName = driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']"));
		typeName.sendKeys("jig");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@role='option'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='form-control date']")).sendKeys("24-12-2022");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='amount-paid']")).sendKeys("1000");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Select Payment Type']")).click();
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='reference_no']")).sendKeys("ref001");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='add_payment']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()=' Yes ']")).click();
		Thread.sleep(4000);

	}

	@Test(priority=8)
	public void allocatePayment_No_TC08() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();
		WebElement typeName = driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']"));
		typeName.sendKeys("jig");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@role='option'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='form-control date']")).sendKeys("24-12-2022");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='amount-paid']")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select Payment Type']")).click();
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='reference_no']")).sendKeys("ref001");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='add_payment']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()=' No ']")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);

	}

}
