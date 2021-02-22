package br.jpassos.taking;

import static io.restassured.RestAssured.given;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ExecutionTestsApi extends MassaDeDados {

	@BeforeClass
	public static void urlBase() {

		RestAssured.baseURI = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/";
	}

	@Test
	public void webMotorsMake(){
	
		Response response = given().contentType("application/json").when().get(urlChallengeMake);
				
		validacao(response);
		
	}
	@Test
	public void webMotorsModel(){
	
		Response response = given().contentType("application/json")
				.pathParam("MakeID", modelo_car)
				.when().get(urlChallengeModel);
				
		validacao(response);
		
	}
	@Test
	public void webMotorsVersion(){
	
		Response response = given().contentType("application/json")
				.pathParam("ModelID", version_car)
				.when().get(urlChallengeVersion);
				
		validacao(response);
		
	}
	@Test
	public void webMotorsVehicles(){
	
		Response response = given().contentType("application/json")
				.pathParam("Page", "")
				.when().get(urlChallengeVehicles);
				
		validacao(response);
		
	}
	

	public void validacao(Response response) {

		response.then().statusCode(200);
		System.out.println("\n RETORNO DA API => " + response.body().asString());
		System.out.println("----------------------------------------------------------");

	}

}
