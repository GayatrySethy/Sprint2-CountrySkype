package Chats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewChat {
	
	WebDriver driver;
	public NewChat(WebDriver driver) {
		this.driver = driver;
	}
	
	By start_chat = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]/div[1]"); 
	
	By newsearch = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");

	public void startchat() {
		driver.findElement(start_chat).click();
		
	}
	
	public void search() {
		driver.findElement(newsearch).click();
		
	}
	
	

}
