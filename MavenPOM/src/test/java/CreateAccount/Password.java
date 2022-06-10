package CreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Password {
	
	WebDriver driver;
	public Password(WebDriver driver) {
		this.driver = driver;
	}
	By pswd = By.xpath("//input[@id='PasswordInput']");
	
	By next = By.xpath("//input[@id='iSignupAction']");
	
	public void SetPassword(String pwd) {
		driver.findElement(pswd).sendKeys(pwd);
		
	}
	
	public void nextClick() {
		driver.findElement(next).click();
		
	}


}
	


