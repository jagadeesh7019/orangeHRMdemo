package Opk;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompoi.landingpage;
import resources.bassee;

public class orangeframework extends bassee {
	WebDriver driver;
	@Test
	public void logintest() throws IOException, Exception {
		landingpage lanpage =new landingpage(driver);
		lanpage.usernamefield().sendKeys(prop.getProperty("username"));
		lanpage.passwordfield().sendKeys(prop.getProperty("password"));
		lanpage.logginbutton().click();
		Thread.sleep(5000);
		File fil=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fil, new File("target\\orange.png"));

	}
	@BeforeMethod
	public void openapplication() throws IOException {
		driver=intializerbrowser();
		driver.get(prop.getProperty("url"));


	}
	@AfterMethod
	public void closer() {
	driver.close();
	}
	

}
