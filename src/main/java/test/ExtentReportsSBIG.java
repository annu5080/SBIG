package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.*;

import java.io.Flushable;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExtentReportsSBIG {
    static ExtentReports extent;
    final static String filepath = "Reports\\ExtentReport.html";
    static Map<Integer, ExtentTest> extentTestMap = new HashMap();
    //ExtentReports extent;
//    ExtentSparkReporter html = new ExtentSparkReporter("Reports\\ExtentReport.html");
    ExtentTest test;

    public synchronized static ExtentReports reportSetup() {
        if (extent == null) {
            ExtentSparkReporter html = new ExtentSparkReporter("Reports\\ExtentReport.html");
            html.config().setDocumentTitle("SBIG Framework");
            html.config().setReportName("SBIG App");
            html.config().setTheme(Theme.DARK);
            extent = new ExtentReports();
            extent.attachReporter(html);
        }
        return extent;
    }
    public static synchronized ExtentTest getTest() {
        return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = reportSetup().createTest(testName, desc);
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
        return test;
    }

}