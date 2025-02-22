package com.mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceTest extends BaseTest{

	public void doLogin() {
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	@Test(priority = 1)
	public void checkInventoryItemTest() {
		doLogin();
		Assert.assertTrue(driver.findElements(By.cssSelector(".inventory_item")).size() == 6);
	}

	@Test(priority = 2)
	public void checkAddToCartButtonTest() {
		doLogin();
		Assert.assertTrue(driver.findElements(By.xpath("//button[text()='Add to cart']")).size() == 6);
	}
	
	@Test(priority = 3)
	public void checkqaintyAccess() {
		driver.get("https://qainty.xactlycorporation.local/xlsweb/login.do?useLegacy=1");
		
	}

}
