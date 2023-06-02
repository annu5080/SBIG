package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LaunchApp {

    public static AppiumDriver getAppiumDriver(){

        //Driver instance
        AppiumDriver appiumDriver = null;
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
        } catch (Exception e){
            e.printStackTrace();
        }
        return appiumDriver;
    }
}
