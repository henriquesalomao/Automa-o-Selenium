

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	@Test
	public void teste() {
		
		
		//WebDriver  driver = new FirefoxDriver();
		 WebDriver  driver = new ChromeDriver();
		//WebDriver  driver = new InternetExplorerDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));// dimensoes da tela do browser
		driver.get("http://www.google.com.br");
		Assert.assertEquals("Google", driver.getTitle());
		//driver.quit(); // fecha abas e mata a instancia do driver aberto
		
	}
}
