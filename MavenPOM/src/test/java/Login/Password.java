package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Password {

		
		WebDriver driver;
		public Password(WebDriver driver) {
			this.driver = driver;
		}
		
		By pswd = By.xpath("//input[@id='i0118']");
		
		By signin = By.xpath("//input[@id='idSIButton9']");
		
		public void pswd(String No) {
			driver.findElement(pswd).sendKeys(No);
			
		}
		
		public void sigin() {
			//driver.findElement(signin).click();
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		}
		
				
		

	}


