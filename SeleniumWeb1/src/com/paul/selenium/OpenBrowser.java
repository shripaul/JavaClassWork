package com.paul.selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	WebDriver driver=new FirefoxDriver();
	@Before
	public void BrowserOpens(){
		driver.get("http://www.starbucks.com/");
		driver.findElement(By.id("nav_coffee")).sendKeys();
		driver.findElement(By.id("nav_menu")).sendKeys();
		driver.findElement(By.id("nav_coffeehouse")).sendKeys();
		driver.findElement(By.id("nav_responsibility")).sendKeys();
		driver.findElement(By.id("nav_card")).sendKeys();
		driver.findElement(By.id("nav_shop")).sendKeys();
	}
@After
public void TestDone(){
driver.close();
}
}
