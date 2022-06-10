package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HostMeeting {
	
	WebDriver driver;
	public HostMeeting(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By gotit = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]/div[1]");
	
	By meet = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/button[1]/div[1]/div[1]");
	
	By host = By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]");
	
	By startcall = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]");
	
	
	public void clickgotit() {
		driver.findElement(gotit).click();
		
	}
	
	
	public void meetnow1() {
		driver.findElement(meet).click();
		
	}
	
	public void hostmeet() {
		driver.findElement(host).click();
		
	}
	
	public void callstarting() {
		driver.findElement(startcall).click();
		
	}
	
	
}
