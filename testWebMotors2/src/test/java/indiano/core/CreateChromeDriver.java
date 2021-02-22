package indiano.core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateChromeDriver {


    public static WebDriver inicializcaoTest() {
        System.setProperty("webdriver.chrome.driver", "target\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.webmotors.com.br/");
        navegador.manage().window().maximize();

        return navegador;
    }
}
