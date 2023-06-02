package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.*;

public class ExtentReportsSBIG {
    ExtentReports extent;
    ExtentSparkReporter html = new ExtentSparkReporter("Reports\\ExtentReport.html");
    ExtentTest test;

    @BeforeTest
    public void reportSetup(){
        html.config().setDocumentTitle("SBIG Framework");
        html.config().setReportName("SBIG App");
        html.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(html);
    }

    @AfterTest
    public void reportTeardown(){
        // calling flush writes everything to the log file
        extent.flush();
    }
}