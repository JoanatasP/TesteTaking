package br.com.jpassos.core;

import static br.com.jpassos.core.DriverFactory.killDriver;

import java.io.IOException;

import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;


public class BaseTest {
	@Rule
	public TestName testName = new TestName();

	
	@After
	public void finaliza() throws IOException{
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

}
