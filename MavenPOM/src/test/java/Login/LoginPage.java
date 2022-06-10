package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By userid = By.xpath("//input[@id='i0116']");
	
	By next = By.xpath("//input[@id='idSIButton9']");
	
	public void userid(String No) {
		driver.findElement(userid).sendKeys(No);
		
	}
	
	public void NextClick() {
		driver.findElement(next).click();
		
	}
	
			
	

}
