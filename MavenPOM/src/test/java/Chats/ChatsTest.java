package Chats;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CreateAccount.SkypeHomePage;
import Login.LoginPage;
import Login.Password;
import Login.StaySigned;

public class ChatsTest {
	WebDriver driver;
	String driverpath ="C:\\\\Users\\\\GAYATRY\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
	
	LoginPage contactNo;
	Password pwd;
	SkypeHomePage homepage;
	StaySigned staysigned;
	
	HostMeeting meet;
	HostMeeting host;
	HostMeeting start;
	

	@BeforeTest
	public void setup() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://web.skype.com/");
		
	}
	@Test
	public void checkedLoggedInSuccessfully() throws InterruptedException {
		
		
		contactNo = new LoginPage(driver);
		pwd = new Password(driver);
		homepage = new SkypeHomePage(driver);
		staysigned = new StaySigned(driver);
		
		meet = new HostMeeting(driver);
		host= new HostMeeting(driver);
		start = new HostMeeting(driver);
		
		meet.meetnow1();
		host.hostmeet();
		Thread.sleep(2000);
		start.callstarting();
		
		contactNo.userid("8208488070");
		contactNo.NextClick();
		Thread.sleep(2000);
		pwd.pswd("Pankaj@213");
		pwd.sigin();
		staysigned.staysigned();
		
	
		
		new Actions(driver).sendKeys(Keys.ESCAPE).build().perform();
	
	
	}
	

}

	

