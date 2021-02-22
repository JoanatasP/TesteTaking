package br.com.jpassos.tests;

import static br.com.jpassos.core.DriverFactory.killDriver;


import org.junit.After;

import br.com.jpassos.core.DriverFactory;
import br.com.jpassos.core.Propriedades;
import br.com.jpassos.core.SeleniumFunctions;

public class AcessarSiteWebMotors extends SeleniumFunctions{
	
	public void acessarPortal (){
	
		DriverFactory.getDriver().get("https://www.webmotors.com.br/");
		
	}
	
	@After
	public void finaliza(){
		
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

	//COLOCAR METODOS DE REPETIDOS COMO POR EXEMPLO LOGIN E SENHA.
}
