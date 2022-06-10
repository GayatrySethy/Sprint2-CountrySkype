package CreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAcc {
	
	WebDriver driver;
	public CreateAcc(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.xpath("//a[@id='easiSwitch']");
	
	By enteremail =  By.xpath("//input[@id='MemberName']");
	
	By Next = By.xpath("//input[@id='iSignupAction']");
	
	public void clickemail() {
		driver.findElement(email).click();
		
	}
	
	public void Setemail(String No) {
		driver.findElement(email).sendKeys(No);
		
	}
	
	public void NextClick() {
		driver.findElement(Next).click();
		
	}

}
