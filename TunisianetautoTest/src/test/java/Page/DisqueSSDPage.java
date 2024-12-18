package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class DisqueSSDPage {
	
@FindBy(xpath="//*[@id=\"js-product-list\"]/div/div/article/div/div[2]/h2/a")
List<WebElement> productlist;

@FindBy(xpath="//*[@id=\"wrapper\"]/div/div/nav/ol/li[5]/a/span")
WebElement  verifproduct;

public DisqueSSDPage() {
	
PageFactory.initElements(Config.driver, this);
}
public void Clicbyname (String ProductName) {
	try {
	for (WebElement Product:productlist) {
		
		if (Product.getText().contains(ProductName)) {
			Product.click();
			Config.attente(10);
			Assert.assertEquals(verifproduct.getText(), ProductName);
		}
	} 
}catch (Exception e) {
	// TODO: handle exception
}
	}
}



