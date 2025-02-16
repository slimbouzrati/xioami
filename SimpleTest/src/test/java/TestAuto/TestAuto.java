package TestAuto;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAuto {

	
	@Test
	public void loginWithValidCredentials() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		
		WebElement bttsubmit = driver.findElement(By.id("submit"));
		bttsubmit.click();
		
		String veriftitle = driver.getTitle();
		
		if (veriftitle.equals("Logged In Successfully | Practice Test Automation")) {
		System.out.println("connexion est etablie, test ok");
		}
		else {
			System.out.println("connexion est echoué, test ko");
			
		}
		}
	
	@Test
	public void loginWithInvalidCredentials() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("slim");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("slim1234");
		
		WebElement bttsubmit = driver.findElement(By.id("submit"));
		bttsubmit.click();
		
		String veriftitle = driver.getTitle();
		
		if(veriftitle.equals("Test Login | Practice Test Automation")) {
			
			System.out.println("test ok");
		}
		else {
			System.out.println("test KO");
		}
	}
		
	}
	

