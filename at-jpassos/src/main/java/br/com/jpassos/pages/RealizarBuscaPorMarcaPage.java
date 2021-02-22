package br.com.jpassos.pages;

import org.openqa.selenium.By;

import br.com.jpassos.core.SeleniumFunctions;

public class RealizarBuscaPorMarcaPage{

	public SeleniumFunctions functions = new SeleniumFunctions();
	

	public void inserirMarca(String marca){
		
		functions.escrever(By.xpath("//*[@id='searchBar']"), marca);
	}
	
	public void selecionarMarca(){
		
		functions.clicarBotao(By.xpath("//div[@class='SearchBar__results__result__name'][contains(.,'Honda  City')]"));
	}
	
	public String validarTextoPaginaResultadoMarca(){
		
		return functions.obterTexto(By.xpath("//*[@class='title-search']"));
	}
	
	public void aceitarCookies(){
		
		functions.clicarBotao(By.xpath("//button[.='OK']"));
	}
	
}
