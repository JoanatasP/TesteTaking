package br.com.jpassos.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jpassos.tests.AcessarSiteWebMotors;

@RunWith(Suite.class)
@SuiteClasses({
	AcessarSiteWebMotors.class,

	//RODAR TESTES POR CLASSE. EX: COLOCAR TODAS AS CLASSES PARA SEREM RODAS DE UMA SÓ VEZ.
	
})
public class SuiteGeral {
	
}
