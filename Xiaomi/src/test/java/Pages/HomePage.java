package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/nav/ul/li/a")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div/div/a/div/div[2]/h4")

	List<WebElement> submenus;
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement verifelem;
	
	public HomePage() {
	PageFactory.initElements(Config.driver,this);
	
	}
	public void mouseHoverOnMenu(String menuName) {
	
		for(WebElement menu:menus) {
			
			if(menu.getText().contains(menuName)) {
				
				Config.actions = new Actions(Config.driver);
				Config.actions.moveToElement(menu).perform();
			}
		}
		
	}

	public void ClickOnProduct(String submenutitle) {
		for (WebElement submenu:submenus) {
			if(submenu.getText().contains(submenutitle)) {
				submenu.click();
			}
		}
}
	public void verif (String name) {
		
		Assert.assertEquals(name, verifelem.getText());
	}
	}
	