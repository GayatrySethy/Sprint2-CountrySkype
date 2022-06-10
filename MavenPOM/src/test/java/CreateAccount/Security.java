package CreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Security {
	
	WebDriver driver;
	public Security(WebDriver driver) {
		this.driver = driver;
	}
	
	By phno = By.xpath("//input[@id='wlspispHIPPhoneInput48cad97df5c640428b3b45c74460214c']");
	By next = By.xpath("//input[@id='iSignupAction']");
	
//	Select country=new Select(driver.findElement(By.xpath("//select[@id='wlspispHIPCountrySelectac2beff5056d41ca9164888b33844b59']")));
//	//country.selectByValue("IN");
//	country.
	
	public void phno(String ec) {
		driver.findElement(phno).sendKeys(ec);
		
	}
	
	
	public void nextClick() {
		driver.findElement(next).click();
		
	}

}
