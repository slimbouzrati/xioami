package Testsuit;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.DisqueSSDPage;

public class DisqueSSDSuit {
	
	@Test
	public void productbyname() {
		Config.driver= new ChromeDriver();
		Config.maximizewindow();
		String url ="https://www.tunisianet.com.tn/379-disques-ssd";
		Config.driver.get(url);
		DisqueSSDPage SSD = new DisqueSSDPage();
		SSD.Clicbyname("Disque Dur Interne Patriot SSD P220 SATA III 2.5 / 128 Go");
	}
	

}
