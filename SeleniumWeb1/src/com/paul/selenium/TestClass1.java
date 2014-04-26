package com.paul.selenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestClass1 extends OpenBrowser {
	@Test
	public void TestStarts(){
		driver.findElement(By.id("signIn")).click();
	}
	

}
