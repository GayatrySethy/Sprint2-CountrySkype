package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaySigned {
	
	WebDriver driver;
	public StaySigned(WebDriver driver) {
		this.driver = driver;
	}
	
	By signedIn = By.xpath("//input[@id='idBtn_Back']");
	
	//By gotit = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]/div[1]");
	
	
	
	public void staysigned() {
		driver.findElement(signedIn).click();
		
	}
	
//	public void clickgotit() {
//		driver.findElement(gotit).click();
//		
//	}
	

}
