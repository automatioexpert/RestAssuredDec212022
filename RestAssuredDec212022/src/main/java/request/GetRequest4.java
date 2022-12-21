package request;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import constants.OLMProjectConstants;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetRequest4 extends TestBase {

	@Test
	public void getRequest() {
		Response response = given().when().get(OLMProjectConstants.getListOfUsersEndPoint);

		Assert.assertEquals(response.getStatusCode(), 200);

		//Retrieve the body of the response
		String body = response.getBody().asString();
		
		System.out.println("Response body is : " + body);

		Assert.assertEquals(body.contains("michael.lawson@reqres.in"), true);
	}

}
