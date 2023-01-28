package pompoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
        WebDriver drive;
     public landingpage(WebDriver driver) {
    	 this.drive=driver;
    	 PageFactory.initElements(driver, this);
    	  }
     @FindBy(name="username")
     WebElement usernamefield;
     
     @FindBy(name="password")
 WebElement passwordfield;
     @FindBy(css="button[type='submit']")
     WebElement logginbutton;
     
     public WebElement usernamefield() {
    	 return usernamefield;
     }
public WebElement passwordfield() {
	return passwordfield;
}
public WebElement logginbutton() {
	return logginbutton;
}



}