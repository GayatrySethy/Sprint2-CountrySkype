package CreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterCode {
	
	WebDriver driver;
	public EnterCode(WebDriver driver) {
		this.driver = driver;
	}
	
	By code = By.xpath("//input[@id='VerificationCode']");
	By next = By.xpath("//input[@id='iSignupAction']");
	
	public void entercode(String ec) {
		driver.findElement(code).sendKeys(ec);
		
	}
	
	
	public void nextClick() {
		driver.findElement(next).click();
		
	}

}
