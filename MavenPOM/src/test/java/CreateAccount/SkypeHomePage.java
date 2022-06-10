package CreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkypeHomePage {
	
	WebDriver driver;
	public SkypeHomePage(WebDriver driver) {
		this.driver = driver;
	}
	By signIn = By.xpath("//span[contains(text(),'Sign in')]");
	
	By signUp = By.xpath("//span[contains(text(),'Sign up')]");
	
	By myacc = By.xpath("//body/div[@id='nav-wrapper']/div[@id='nav-buttons-wrapper']/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]");
	

	

	
	public void click_signIn() {
		driver.findElement(signIn).click();
	}
	
	public void click_signUp() {
		driver.findElement(signUp).click();
	}
	
	public void click_myacc() {
		driver.findElement(myacc).click();
	}
	
	
	
	
}
