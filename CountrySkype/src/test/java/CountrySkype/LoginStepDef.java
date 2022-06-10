package CountrySkype;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	String driverpath="C:\\Users\\GAYATRY\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe";
	@Given("User navigates to url")
	public void user_navigates_to_url() {

		System.setProperty("webdriver.gecko.driver", driverpath);
		driver = new FirefoxDriver();
		driver.get("https://web.skype.com/");

	}


	@When("User enters valid credentials")
	public void User_enters_valid_credentials(DataTable usercredentials) {

		List<List<String>> data = usercredentials.cells();
		// Enter data
		driver.findElement(By.name("loginfmt"));
		WebElement emailField = driver.findElement(By.name("loginfmt"));
		emailField.sendKeys(data.get(0).get(0));

		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		driver.findElement(By.id("i0118"));
		WebElement passwordField = driver.findElement(By.id("i0118"));
		passwordField.sendKeys(data.get(0).get(1));

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
		.click();

	}

			@Then("User Login Successful")
			public void User_Login_Successful() {
				if (driver.getCurrentUrl().equalsIgnoreCase("https://web.skype.com/")) {
					System.out.println("Login Passed");
				} else {
					System.out.println("Login Failed");
				}
	
			}

	@Then("user should click on setting and add photo and upload")
	public void user_should_click_on_setting_and_add_photo_and_upload() {
		// Write code here that turns the phrase above into concrete actions

		//setting button
		driver.findElement(By.tagName("button")).click();

		//click on setting
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();

		//click on add photo
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]")).click();

		//click on upload photo
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/button[2]/div[1]")).click();

	}

	@Then("user should come back to accounts and pictures and clicks on edit for birthday")
	public void user_should_come_back_to_accounts_and_pictures_and_clicks_on_edit_for_birthday() {
		// Write code here that turns the phrase above into concrete actions

		//click on birthday
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/button[1]/div[2]")).click();

		//click on edit
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
	}

	@Then("user should click on contacts send invites and add contact")
	public void user_should_click_on_contacts_send_invites_and_add_contact() {
		// Write code here that turns the phrase above into concrete actions

		//click on contacts
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[3]/div[1]/div[1]")).click();

		//create new contact
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/button[1]/div[1]/div[1]")).click();

		//click on invite skpye
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
	}

	@Then("user should click on setting and customize appearance and audio and video")
	public void user_should_click_on_setting_and_customize_appearance_and_audio_and_video() {
		// Write code here that turns the phrase above into concrete actions

		//click on setting icon
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();

		//click on setting
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();

		//click on appearance
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]")).click();

		//click on dark theme
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/button[2]")).click();


		//click on audio video option
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]")).click();
	}

	@Then("user should customize calling and messaging and notification")
	public void user_should_customize_calling_and_messaging_and_notification() {
		// Write code here that turns the phrase above into concrete actions

		//click on calling
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[1]")).click();

		//click on callerId
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();

		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]/div[2]")).click();


		//click on messaging
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]")).click();

		//clicking on notifications
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]")).click();
	}



	@After
	public void closeBrowser() {
		driver.close();
	}

}


