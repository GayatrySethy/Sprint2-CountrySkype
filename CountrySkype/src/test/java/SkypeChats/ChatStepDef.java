package SkypeChats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChatStepDef {
	WebDriver driver;
	String driverpath = "C:\\Users\\GAYATRY\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe";

	@Given("User starts a conversation")
	public void User_starts_a_conversation() {

		System.setProperty("webdriver.gecko.driver", driverpath);
		driver = new FirefoxDriver();
		driver.get("https://web.skype.com/");

	}

	@When("user should scedule a call")
	public void user_should_scedule_a_call() {
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[2]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("\"//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]\"")).click();
		
		

	}

	@Then("share files, contact")
	public void share_files_contact() {

	}

	@Then("send voice message")
	public void send_voice_message() {

	}

	@Then("user should do a video call")
	public void user_should_do_a_video_call() {

	}

	@Then("Host meeting with meet now")
	public void host_meeting_with_meet_now() {

	}

	@Then("New Group chat")
	public void new_group_chat() {
		
	}
	
	@Then("check for notification")
	public void check_for_notification() {
	  
	}

}
