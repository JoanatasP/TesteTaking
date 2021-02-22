package br.com.jpassos.core;

public class Propriedades {
	
	//para fechar o browser após a execução.
	public static boolean FECHAR_BROWSER = true;
	
	public static Browsers browser = Browsers.CHROME;
		
	public enum Browsers {
		CHROME,
		FIREFOX
	}
	
}
