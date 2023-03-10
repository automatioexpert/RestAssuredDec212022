package request;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import constants.OLMProjectConstants;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetRequest3 extends TestBase {

	@Test
	public void getRequest() {
		Response response = given().when().get(OLMProjectConstants.getListOfUsersEndPoint);

		Assert.assertEquals(response.getStatusCode(), 200);

		ResponseBody body = response.getBody();
		System.out.println("Response body is : " + body.asString());

	}

}
