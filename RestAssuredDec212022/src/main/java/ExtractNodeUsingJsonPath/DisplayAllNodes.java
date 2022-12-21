package ExtractNodeUsingJsonPath;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import constants.OLMProjectConstants;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class DisplayAllNodes extends TestBase {

	@Test
	public void getRequest() {
		Response response = given().when().get(OLMProjectConstants.getListOfUsersEndPoint);

		Assert.assertEquals(response.getStatusCode(), 200);

		// First get the JsonPath object instance from the Response interface
		JsonPath jsonPath = response.jsonPath();
		response.prettyPrint();

		//Print page node
		System.out.println(" "+jsonPath.get("page"));
		System.out.println(" "+jsonPath.get("per_page"));
		System.out.println(" "+jsonPath.get("total"));
		System.out.println(" "+jsonPath.get("total_pages"));
		System.out.println(" "+jsonPath.get("data"));
		System.out.println(" "+jsonPath.get("support"));
		
	}

}
