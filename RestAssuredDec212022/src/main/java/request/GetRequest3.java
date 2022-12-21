package request;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import base.TestBase;
import constants.OLMProjectConstants;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest3 extends TestBase {

	@Test
	public void getRequest() {
		//RestAssured.baseURI = "https://reqres.in/";
		Response response=given().
		when().
		get(OLMProjectConstants.getListOfUsersEndPoint);
		
		response.prettyPrint();
				
	}

}
