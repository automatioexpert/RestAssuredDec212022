package ExtractNodeUsingJsonPath;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import constants.OLMProjectConstants;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetRequest4 extends TestBase {

	@Test
	public void getRequest() {
		Response response = given().when().get(OLMProjectConstants.getListOfUsersEndPoint);

		Assert.assertEquals(response.getStatusCode(), 200);

		// First get the JsonPath object instance from the Response interface
		JsonPath jsonPath = response.jsonPath();
		int page = jsonPath.get("page");
		System.out.println(page);

		// Let us print the page variable to see what we got
		System.out.println("Page received from Response " + page);

		// Validate the response
		Assert.assertEquals(page, 2);

	}

}
