package com.shop.qa.pages;

import java.util.List;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.shop.qa.base.TestBase;

public class Buyer extends TestBase{

	//Page Factory

//	@FindBy(name="userBean.email")
//	WebElement username;
	
	public static void lnk_Buyers(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);

		driver.findElement(By.linkText("Buyers")).click();
		
		String addRandomBuyer = UUID.randomUUID().toString();

		// Click on Add New Buyer button
		driver.findElement(By.xpath("//*[@id=\"buyers\"]/div[2]/div[3]/div/a")).click();

		// Check the validation
		driver.findElement(By.name("searchResult")).click();

		Thread.sleep(2000);

		// Fill first name
		driver.findElement(By.name("buyers.firstName")).sendKeys(addRandomBuyer);

		Thread.sleep(2000);

		// Fill last name
		driver.findElement(By.name("buyers.lastName")).sendKeys(addRandomBuyer);

		Thread.sleep(2000);

		// Fill Email
		driver.findElement(By.name("buyers.email")).sendKeys("deepak@gmail.com");

		Thread.sleep(2000);

		// Fill phone
		driver.findElement(By.name("buyers.phone")).sendKeys("8557847992");

		Thread.sleep(2000);

		// Fill billing address
		driver.findElement(By.name("buyers.billingAddress")).sendKeys("H. N. 343");

		Thread.sleep(2000);

		// Fill city
		driver.findElement(By.name("buyers.billingCity")).sendKeys("Mohali");

		Thread.sleep(2000);

		// Fill postalCode
		driver.findElement(By.name("buyers.billingPostalCode")).sendKeys("160062");

		Thread.sleep(2000);

		// Same as Billing Address

		driver.findElement(By.id("sameasbilling")).click();

		Thread.sleep(2000);

		// Click on submit button
		driver.findElement(By.name("searchResult")).click();

		Thread.sleep(2000);

		// Count the total buyers
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered']"));
		List<WebElement> row = table.findElements(By.tagName("tbody"));
		// System.out.println("Total Number of Rows = " + row.size());

		Thread.sleep(3000);

		// Delete last added buyer
		driver.findElement(By.xpath("//*[@id='dataTable']/tbody[" + row.size() + "]/tr/td[7]/a[2]/i")).click();

		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//*[@id='myModal1']/div/div/div[3]/button[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

		Thread.sleep(4000);

		/****************** //Again add the new buyer *************************/

		// Click on Add New Buyer button
		driver.findElement(By.xpath("//*[@id=\"buyers\"]/div[2]/div[3]/div/a")).click();

		Thread.sleep(2000);

		// Fill first name
		driver.findElement(By.name("buyers.firstName")).sendKeys("Deepak");

		Thread.sleep(2000);

		// Fill last name
		driver.findElement(By.name("buyers.lastName")).sendKeys("Chamoli");

		Thread.sleep(2000);

		// Fill Email
		driver.findElement(By.name("buyers.email")).sendKeys("deepak@gmail.com");

		Thread.sleep(2000);

		// Fill phone
		driver.findElement(By.name("buyers.phone")).sendKeys("8555654367");

		Thread.sleep(2000);

		// Fill billing address
		driver.findElement(By.name("buyers.billingAddress")).sendKeys("H. N. 344");

		Thread.sleep(2000);

		// Fill city
		driver.findElement(By.name("buyers.billingCity")).sendKeys("Punjab");

		Thread.sleep(2000);

		// Fill postalCode
		driver.findElement(By.name("buyers.billingPostalCode")).sendKeys("160055");

		Thread.sleep(2000);
		// Same as Billing Address

		driver.findElement(By.id("sameasbilling")).click();

		Thread.sleep(2000);

		// Click on submit button
		driver.findElement(By.name("searchResult")).click();

		// Count the latest buyers
		WebElement table1 = driver.findElement(By.xpath("//table[@class='table table-bordered']"));
		List<WebElement> row1 = table1.findElements(By.tagName("tbody"));
		// System.out.println("Total Number of Rows1 = " + row1.size());

		// Clicking on Edit icon
		driver.findElement(By.xpath("//*[@id='dataTable']/tbody[" + row1.size() + "]/tr/td[7]/a[1]/i")).click();

		Thread.sleep(2000);

		String editRandomfirstname = UUID.randomUUID().toString();

		// Clear first name
		driver.findElement(By.name("buyers.firstName")).clear();

		Thread.sleep(2000);

		// Edit first name
		driver.findElement(By.name("buyers.firstName")).sendKeys(editRandomfirstname);

		Thread.sleep(2000);

		// Clear last name
		driver.findElement(By.name("buyers.lastName")).clear();

		String editRandomlastname = UUID.randomUUID().toString();

		// Edit last name
		driver.findElement(By.name("buyers.lastName")).sendKeys(editRandomlastname);

		Thread.sleep(2000);

		// Clear email
		driver.findElement(By.name("buyers.email")).clear();

		Thread.sleep(2000);

		// Edit Email
		driver.findElement(By.name("buyers.email")).sendKeys("test@gmail.com");

		Thread.sleep(2000);

		Select stateSelect = new Select(driver.findElement(By.name("buyers.billingState")));
		stateSelect.selectByValue("Chandigarh");

		Thread.sleep(2000);

		Select stateCountry = new Select(driver.findElement(By.name("buyers.billingCountry")));
		stateCountry.selectByValue("India");

		// Click on submit button
		driver.findElement(By.name("searchResult")).click();

		Thread.sleep(4000);

		// Search buyer by first name
		driver.findElement(By.name("buyers.firstName")).sendKeys("Deepak");

		Thread.sleep(1000);

		// Click on search button
		driver.findElement(By.xpath("//*[@id='searchResult']")).click();

		Thread.sleep(1000);

		// Click on Show All
		driver.findElement(By.xpath("//*[@id='buyers']/div[2]/div[2]/div/a")).click();
	}
}
