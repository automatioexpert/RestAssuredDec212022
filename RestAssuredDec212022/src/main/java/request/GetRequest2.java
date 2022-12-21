package request;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.TestBase;
import constants.OLMProjectConstants;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest2 extends TestBase {

	@Test
	public void getRequest() {
		// RestAssured.baseURI = "https://reqres.in/";
		Response response = given().when().get(OLMProjectConstants.getListOfUsersEndPoint);
		response.prettyPrint();
		// Add the response data to the extent report
		System.out.println(response.asString());
		test.log(Status.INFO, response.asString());

	}

}
