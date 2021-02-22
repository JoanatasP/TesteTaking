package br.com.jpassos.pages;

import org.openqa.selenium.By;

import br.com.jpassos.core.SeleniumFunctions;

public class RealizarBuscaPorModeloPage {

	public SeleniumFunctions functions = new SeleniumFunctions();

	public void inserirModelo(String modelo) {

		functions.escrever(By.xpath("//*[@id='searchBar']"), modelo);
	}

	public void selecionarModelo() {

		functions.clicarBotao(By.xpath("//div[@class='SearchBar__results__result__name'][contains(.,'Honda City')]"));
	}

	public void clicarCampoDePesquisa() {

		functions.clicarBotao(By.xpath("//*[@id='searchBar']"));
	}

	public String numeroEstoque() {

		return functions.obterTexto(By.xpath("//strong[@class='sc-hzDkRC gcWVAm']"));
	}
	public String textoEstoque() {

		return functions.obterTexto(By.xpath("//*[text()='carros encontrados']"));
	}
	
	public String textoEstoqueCompleto() {

		return functions.obterTexto(By.xpath("//*[@class='sc-bRBYWo gLEvJK']"));
	}
	

}
