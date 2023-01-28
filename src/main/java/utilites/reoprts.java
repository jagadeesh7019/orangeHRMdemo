package utilites;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reoprts {
	static ExtentReports ExtentReport;
	
	public static ExtentReports Getextendreport() {
		String reportpath = System.getProperty("user.dir")+"\\Report\\extendReport.html";
		ExtentSparkReporter report=new ExtentSparkReporter(reportpath);
		report.config().setReportName("OrengeHRM Report");
		report.config().setDocumentTitle("test Report");
		
		 ExtentReport = new ExtentReports();
		ExtentReport.attachReporter(report);
		ExtentReport.setSystemInfo("Operating System", "Windos10");
		ExtentReport.setSystemInfo("Tested by ", "Jagadeesh");
		return ExtentReport;
	}
	
	
	

}
