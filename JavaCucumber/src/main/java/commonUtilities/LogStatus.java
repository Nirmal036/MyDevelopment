package commonUtilities;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LogStatus {

	
	public static ExtentReports report;
	public static ExtentTest logState;
	
	public LogStatus() {
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/report.html");
		report = new ExtentReports();
		report.attachReporter(extent);
	}
}
