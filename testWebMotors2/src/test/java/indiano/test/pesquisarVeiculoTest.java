package indiano.test;


import indiano.core.CreateChromeDriver;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.junit.After;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class pesquisarVeiculoTest{

    private WebDriver navegador;

    @Before
    public void setup() {
        navegador = CreateChromeDriver.inicializcaoTest();

    }

    @Test
    public void testandoBuscaPorMarcaWebmotors(){
       
        navegador.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/button")).click();
        navegador.findElement(By.id("searchBar")).sendKeys("Honda");
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.xpath("//*[@id='WhiteBox']/div[1]/div[2]/div/div/div/div/div/div[1]/a/div[2]")).click();

        String EstoqueResultado = navegador.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div[1]/p")).getText();
        assertEquals(EstoqueResultado, EstoqueResultado);
        System.out.println(EstoqueResultado + navegador.getTitle());

    }
    @Test
    public void testandoBuscaPorModeloWebmotors(){
       
        navegador.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/button")).click();
        navegador.findElement(By.id("searchBar")).sendKeys("HONDA CITY");
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[2]/div/div/div/div/div/div/a/div[2]")).click();

        String EstoqueResultado = navegador.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div[1]/p")).getText();
        assertEquals(EstoqueResultado, EstoqueResultado);
        System.out.println(EstoqueResultado + navegador.getTitle());

    }
    
    @After
    public void tearDown () {
        navegador.quit();
    }

}
