package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import constants.OLMProjectConstants;
import io.restassured.RestAssured;
import utilities.ExtentManager;

public class TestBase {


	//Extent Report
	public static ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;

	
	@BeforeSuite
	public void setUp() {

		RestAssured.baseURI = OLMProjectConstants.baseURI;
	
	}

	@AfterSuite
	public void tearDown() {

		// Shut down everything post all the test execution

	}
}
