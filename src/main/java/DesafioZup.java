import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesafioZup {
	
	
	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.submarino.com.br/");
		Thread.sleep(5000);
		
		WebElement inputProduto = driver.findElement(By.xpath("//input[@id = 'h_search-input']"));
		inputProduto.sendKeys("Xbox One");
		
		Thread.sleep(5000);
		
		WebElement btnPesquisar = driver.findElement(By.xpath("//button[@id = 'h_search-btn']"));
		btnPesquisar.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//h1[contains(text(), 'Xbox One')]")).getText().equals("Xbox One");
		
		Thread.sleep(5000);
		WebElement produto = driver.findElement(By.xpath("//div//img[@alt = 'Console Microsoft Xbox One S 1TB All Digital Edition V2 - Game Minecraft + Game Sea of Thieves + Voucher Fortnite']"));
		produto.click();
		
		Thread.sleep(5000);
		WebElement btnComprar = driver.findElement(By.xpath("//a[@id = 'btn-buy']"));
		btnComprar.click();
		
		Thread.sleep(5000);
		WebElement btnContinuar = driver.findElement(By.xpath("//button[@id = 'btn-continue']"));
		btnContinuar.click();
		
		driver.findElement(By.xpath("//a[@title = 'Console Microsoft Xbox One S 1TB All Digital Edition V2 - Game Minecraft + Game Sea of Thieves + Voucher Fortnite']")).getText().equals("Console Microsoft Xbox One S 1TB All Digital Edition V2 - Game Minecraft + Game Sea of Thieves + Voucher Fortnite");
	
		Thread.sleep(5000);
		WebElement btnFinalizar = driver.findElement(By.xpath("//button[@id = 'buy-button']"));
		btnFinalizar.click();
		
		driver.findElement(By.xpath("//span[contains(text(), 'Login do Cliente')]")).getText().equals("Login do Cliente");
		
		Thread.sleep(5000);

		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
