package Opk;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.bassee;

public class test2 extends bassee {
	public WebDriver driver;
	@Test
	public void testone() throws Exception {
		
		System.out.println("one test");
		 driver = intializerbrowser();
		driver.get("http://omayo.blogspot.com/");
		Assert.assertFalse(true);
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void closer() {
		driver.close();

	}

}
