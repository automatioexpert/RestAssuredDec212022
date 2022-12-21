package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	public static ExtentReports extent;

	public static ExtentReports getInstance() {
		
		
		if (extent == null) {

			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/ExtentReport/"+DateString.getCurrentDate()+"_extent.html");
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Automation Report Rest Assured");
			spark.config().setReportName("Automation report for OLM Project");

		}

		return extent;
	}

}