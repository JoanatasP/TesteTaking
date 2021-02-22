import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class webmotors {
		
		private WebDriver driver;
		private DSL dsl;
			
			@Before
			public void inicializa() {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.webmotors.com.br/");
				dsl = new DSL(driver);
			}
			
			
			@After
			public void finaliza() {
				driver.quit();
			}

	
	@Test
	public void testandoBuscaPorMarca() {
			
			try {
				
				dsl.clicarBotao(By.xpath("//button[text()='OK']"));
				dsl.escrever("searchBar", "Honda"); 
				Thread.sleep(3000);
				dsl.clicarBotao(By.xpath("//*[@id=\'WhiteBox\']/div[1]/div[2]/div/div/div/div/div/div[1]/a/div[2]"));
			} catch (Exception e) {
			}
			
			}		

	
	@Test
	public void testandoBuscaPorModelo() {
		
		try {
			
			dsl.clicarBotao(By.xpath("//button[text()='OK']"));
			dsl.escrever("searchBar", "Honda"); 
			Thread.sleep(5000);
			dsl.clicarBotao(By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[2]/div/div/div/div/div/div[2]/a[3]/div[2]"));
			Assert.assertEquals("Honda City em Cajamar/SP - Novos e Usados", dsl.obterValorCampo("//*[@id=\"root\"]/main/div[1]/div[3]/h1")); 
		} catch (Exception e) {
		}
		
		}		






}