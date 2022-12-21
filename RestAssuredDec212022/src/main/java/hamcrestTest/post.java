package hamcrestTest;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.TestBase;
import constants.OLMProjectConstants;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class post extends TestBase {
	
	@Test
	public void postTest() {
	Response response=	given()
		.log()
		.all()
		.contentType(ContentType.JSON)
		.when()
		.post(OLMProjectConstants.postUserEndPoint);
		
	System.out.println(response.getStatusCode());
	System.out.println(response.getStatusLine());
	System.out.println(response.getContentType());
	System.out.println(response.getSessionId());
	System.out.println(response.getTime());
	System.out.println(response.getTimeIn(TimeUnit.SECONDS));
	System.out.println(response.getDetailedCookies());

		
			
	}

}
