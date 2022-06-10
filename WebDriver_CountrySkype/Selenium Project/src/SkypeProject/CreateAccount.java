package SkypeProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CMANWAR\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://web.skype.com/");
		// driver.navigate().to(baseUrl);
		//click on the signup
				driver.findElement(By.xpath("//a[@id='signup']")).click();
				Thread.sleep(1000);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				//providing usernumber for signup
				driver.findElement(By.id("MemberName"));
				WebElement usernumber = driver.findElement(By.id("MemberName"));
				Thread.sleep(1000);
				usernumber.sendKeys("8983402539");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[5]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/input[1]")).click();
		//providing password 
		WebElement passwordField = driver.findElement(By.id("PasswordInput"));
		passwordField.sendKeys("Chaitanya@123");
		driver.findElement(By.xpath("//input[@id='iSignupAction']")).click();
		//providing user firstname and lastname
				WebElement inputField = driver.findElement(By.id("FirstName"));
				inputField.sendKeys("Chaitanya");
				WebElement textField = driver.findElement(By.id("LastName"));
				textField.sendKeys("Manwar");
				driver.findElement(By.xpath("//input[@id='iSignupAction']")).click();
		
	}
}
