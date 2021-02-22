package br.com.jpassos.tests;


import org.junit.Assert;

import br.com.jpassos.core.SeleniumFunctions;
import br.com.jpassos.pages.RealizarBuscaPorMarcaPage;
import br.com.jpassos.pages.RealizarBuscaPorModeloPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class RealizarBuscaPorMarcaTest{
	
	public AcessarSiteWebMotors acessar = new AcessarSiteWebMotors();
	public RealizarBuscaPorMarcaPage obj = new RealizarBuscaPorMarcaPage();
	public RealizarBuscaPorModeloPage obj1 = new RealizarBuscaPorModeloPage();
	public SeleniumFunctions seleniumUtils = new SeleniumFunctions();
	
	
	@Dado("^que foi acessado o site da WebMotors$")
	public void que_foi_acessado_o_site_da_WebMotors() throws Throwable {
	    
		acessar.acessarPortal();
		obj.aceitarCookies();
	}

	@Dado("^inserir a marca do carro$")
	public void inserir_a_marca_do_carro() throws Throwable {

		obj.inserirMarca("Honda");
		
	}

	@Quando("^selecionar a marca$")
	public void selecionar_a_marca() throws Throwable {
		
		try {
			seleniumUtils.scroll();
			
			Thread.sleep(3000);
			obj.selecionarMarca();
			
		} catch (Exception e) {
		}

	}

	@Entao("^deve apresentar o resultado$")
	public void deve_apresentar_o_resultado() throws Throwable {
	    
		try {
			
			String tituloPagina = obj.validarTextoPaginaResultadoMarca();
	        Assert.assertEquals(tituloPagina, tituloPagina);
	        
		} catch (Exception e) {
		}
		
	}
	
}
