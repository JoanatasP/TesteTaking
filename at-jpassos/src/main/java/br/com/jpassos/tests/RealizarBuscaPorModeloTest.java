package br.com.jpassos.tests;

import org.junit.Assert;

import br.com.jpassos.core.SeleniumFunctions;
import br.com.jpassos.pages.RealizarBuscaPorModeloPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class RealizarBuscaPorModeloTest {

	public AcessarSiteWebMotors acessar = new AcessarSiteWebMotors();
	public RealizarBuscaPorModeloPage obj1 = new RealizarBuscaPorModeloPage();
	public SeleniumFunctions seleniumUtils = new SeleniumFunctions();
	
	@Dado("^inserir o modelo do carro$")
	public void inserir_o_modelo_do_carro() throws Throwable {

		try {
			
			Thread.sleep(3000);
			obj1.clicarCampoDePesquisa();
			obj1.inserirModelo("City");
			
		} catch (Exception e) {
		}
		
	}

	@Quando("^selecionar o modelo$")
	public void selecionar_o_modelo() throws Throwable {
	    
		try {
			
			seleniumUtils.scroll();
			
			Thread.sleep(3000);
			obj1.selecionarModelo();
			
			String numeroEstoque = obj1.numeroEstoque();
			String textoEstoque = obj1.textoEstoque();
			
			Assert.assertEquals(numeroEstoque + textoEstoque, obj1.textoEstoqueCompleto());
			
		} catch (Exception e) {
		}
	}
}
