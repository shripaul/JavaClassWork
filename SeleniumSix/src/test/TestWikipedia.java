package test;

import org.openqa.selenium.by;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestWikipedia {

	public static void main(String[] args) throw Interrrupted Exception {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://wikipedia.org");
		WebElement link;
		link = driver.findElement(By.linkText("English"));
		

	}

}
