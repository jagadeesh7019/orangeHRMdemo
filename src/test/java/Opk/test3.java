package Opk;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.bassee;

public class test3 extends bassee {
	@Test
	public void Testthree() throws Exception {
		WebDriver driver = intializerbrowser();
		driver.get("https://mvnrepository.com/artifact/com.aventstack/extentreports/5.0.9");
		Thread.sleep(5000);
		driver.close();
	}
	

}
