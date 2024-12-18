import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExTest {
	
	@Test
	public void TestPopUp() {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://szimek.github.io/signature_pad/";
		driver.get(url);
		
		WebElement bttsave = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/button[1]"));
		bttsave.click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		String expectedtext = "Please provide a signature first.";
		
		Assert.assertEquals(expectedtext, text);
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
