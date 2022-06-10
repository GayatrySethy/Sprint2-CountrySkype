package CreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Details {
	
	WebDriver driver;
	public Details(WebDriver driver) {
		this.driver = driver;
	}
	By firstname = By.xpath("//input[@id='FirstName']");
	By lastname = By.name("LastName");
	By next = By.xpath("//input[@id='iSignupAction']");
	
	public void Setfirstname(String fn) {
		driver.findElement(firstname).sendKeys(fn);
		
	}
	
	public void Setlastname(String ln) {
		driver.findElement(lastname).sendKeys(ln);
		
	}
	
	public void nextClick() {
		driver.findElement(next).click();
		
	}

}
