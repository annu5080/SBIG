package test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.ExtentReportsSBIG;
import utils.MobileCapabilityEx;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass extends ExtentReportsSBIG {
    AppiumDriver appiumDriver ;
    @BeforeTest
    public void setUp() {
        try {
            //Set Desired Capabilities to send to appium server
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityEx.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityEx.DEVICE_NAME, "Realme");
            desiredCapabilities.setCapability(MobileCapabilityEx.UDID, "emulator-5554");
            desiredCapabilities.setCapability(MobileCapabilityEx.PLATFORM_VERSION, "9.0");
            desiredCapabilities.setCapability(MobileCapabilityEx.APP_PACKAGE, "com.sbig.insurance.dev");
            desiredCapabilities.setCapability(MobileCapabilityEx.APP_ACTIVITY, "sbig.sbig_app.MainActivity");
            desiredCapabilities.setCapability(MobileCapabilityEx.AUTOGRANTPERMISSION, "true");

            //setup the appium server URL to connect to
            URL appiumServer = new URL("http://localhost:4723/wd/hub");

        appiumDriver = new AppiumDriver(appiumServer, desiredCapabilities);
        appiumDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

        } catch (Exception e) {
            System.out.println("Cause is : " + e.getCause());
            System.out.println("Message is : " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void startTest(){
        System.out.println("Session Started...........");
    }

    @AfterTest
    public void tearDown(){
        appiumDriver.quit();
    }
    public void captureScreenshot(String filename) {
        TakesScreenshot takesScreenshot = appiumDriver;
        File sourceFile = appiumDriver.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshot/" + filename);
        try{
            FileUtils.copyFile(sourceFile, destFile);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        System.out.println("Screenshot saved successfully");
    }

}
