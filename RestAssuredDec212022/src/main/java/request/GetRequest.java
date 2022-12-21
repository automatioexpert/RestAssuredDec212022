package request;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class GetRequest {

	@Test
	public void getRequest() {
		RestAssured.baseURI = "https://reqres.in/";

		given().
		when().
		get("api/unknown/2").
		then().
		assertThat()
		.statusCode(2000);
		
	}

}
