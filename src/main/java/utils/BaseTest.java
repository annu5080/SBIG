package utils;

import com.aventstack.extentreports.Status;
import test.ExtentReportsSBIG;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.ITestResult;
import org.testng.annotations.*;

import javax.mail.MessagingException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BaseTest {
    protected static ThreadLocal<AndroidDriver> driver = new ThreadLocal<AndroidDriver>();
    protected static ThreadLocal<Properties> props = new ThreadLocal<Properties>();
    protected static ThreadLocal<HashMap<String, String>> strings = new ThreadLocal<HashMap<String, String>>();
    protected static ThreadLocal<String> platform = new ThreadLocal<String>();
    protected static ThreadLocal<String> dateTime = new ThreadLocal<String>();
    protected static ThreadLocal<String> deviceName = new ThreadLocal<String>();
    private static AppiumDriverLocalService server;
    static TestUtils utils = new TestUtils();

    public static AndroidDriver getDriver() {
        return driver.get();
    }

    public void setDriver(AppiumDriver driver2) {
        driver.set((AndroidDriver) driver2);
    }

    public Properties getProps() {
        return props.get();
    }

    public void setProps(Properties props2) {
        props.set(props2);
    }

    public HashMap<String, String> getStrings() {
        return strings.get();
    }

    public void setStrings(HashMap<String, String> strings2) {
        strings.set(strings2);
    }

    public static String getPlatform() {
        return platform.get();
    }

    public void setPlatform(String platform2) {
        platform.set(platform2);
    }

    public String getDateTime() {
        return dateTime.get();
    }

    public void setDateTime(String dateTime2) {
        dateTime.set(dateTime2);
    }

    public String getDeviceName() {
        return deviceName.get();
    }

    public void setDeviceName(String deviceName2) {
        deviceName.set(deviceName2);
    }

    public BaseTest() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    @BeforeMethod
    public void beforeMethod() {
//		((CanRecordScreen) getDriver()).startRecordingScreen();
    }

    //	stop video capturing and create *.mp4 file
    @AfterMethod
    public synchronized void afterMethod(ITestResult result) throws Exception {
        String media = ((CanRecordScreen) getDriver()).stopRecordingScreen();

        Map<String, String> params = result.getTestContext().getCurrentXmlTest().getAllParameters();
        String dirPath = "videos" + File.separator + params.get("platformName") + "_" + params.get("deviceName")
                + File.separator + getDateTime() + File.separator + result.getTestClass().getRealClass().getSimpleName();

        File videoDir = new File(dirPath);

        synchronized (videoDir) {
            if (!videoDir.exists()) {
                videoDir.mkdirs();
            }
        }
        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream(videoDir + File.separator + result.getName() + ".mp4");
            stream.write(Base64.decodeBase64(media));
            stream.close();
            utils.log().info("video path: " + videoDir + File.separator + result.getName() + ".mp4");
        } catch (Exception e) {
            utils.log().error("error during video capture" + e.toString());
        } finally {
            if(stream != null) {
                stream.close();
            }
        }
    }

    @BeforeSuite
    public void beforeSuite() throws Exception {
        ThreadContext.put("ROUTINGKEY", "ServerLogs");
//		server = getAppiumService(); // -> If using Mac, uncomment this statement and comment below statement
        server = getAppiumServerDefault(); // -> If using Windows, uncomment this statement and comment above statement
        if (!checkIfAppiumServerIsRunning(4723)) {
            server.start();
            server.clearOutPutStreams(); // -> Comment this if you don't want to see server logs in the console
            utils.log().info("Appium server started");
        } else {
            utils.log().info("Appium server already running");
        }
    }

    public boolean checkIfAppiumServerIsRunning(int port) throws Exception {
        boolean isAppiumServerRunning = false;
        ServerSocket socket = null;
        try {
            socket = new ServerSocket(port);
        } catch (Exception e) {
            isAppiumServerRunning = true;
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
        return isAppiumServerRunning;
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        if (server.isRunning()) {
            server.stop();
            utils.log().info("Appium server stopped");

        }
    }

    // for Windows
    public AppiumDriverLocalService getAppiumServerDefault() {
        return AppiumDriverLocalService.buildDefaultService();
    }

    // for Mac. Update the paths as per your Mac setup
//    public AppiumDriverLocalService getAppiumService() {
//        HashMap<String, String> environment = new HashMap<String, String>();
//        environment.put("PATH", "C:/Users/rajka/AppData/Local/Android/Sdk/tools:C:/Users/rajka/AppData/Local/Android/Sdk/platform-tools:C:/Users/rajka/AppData/Local/Android/Sdk/platforms" + System.getenv("PATH"));
//        environment.put("ANDROID_HOME", "C:/Users/rajka/AppData/Local/Android/Sdk");
//        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//                .usingDriverExecutable(new File("C:/Program Files/nodejs"))
//                .withAppiumJS(new File("C:/Users/rajka/node_modules/appium/build/lib/main.js"))
//                .usingPort(4723)
//                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
////				.withArgument(() -> "--allow-insecure","chromedriver_autodownload")
//                .withEnvironment(environment)
//                .withLogFile(new File("ServerLogs/server.log")));
//    }
    @Parameters({"emulator", "platformName", "udid", "deviceName", "systemPort",
            "chromeDriverPort", "wdaLocalPort", "webkitDebugProxyPort"})
    @BeforeTest
    public void beforeTest(@Optional("androidOnly") String emulator, String platformName, String udid, String deviceName,
                           @Optional("androidOnly") String systemPort, @Optional("androidOnly") String chromeDriverPort,
                           @Optional("iOSOnly") String wdaLocalPort, @Optional("iOSOnly") String webkitDebugProxyPort) throws Exception {
        setDateTime(utils.dateTime());
        setPlatform(platformName);
        setDeviceName(deviceName);
        URL url;
        InputStream inputStream = null;
        InputStream stringsis = null;
        Properties props = new Properties();
        AppiumDriver driver;

        String strFile = "logs" + File.separator + platformName + "_" + deviceName;
        File logFile = new File(strFile);
        if (!logFile.exists()) {
            logFile.mkdirs();
        }
        //route logs to separate file for each thread
        ThreadContext.put("ROUTINGKEY", strFile);
        utils.log().info("log path: " + strFile);

        try {
            props = new Properties();
            String propFileName = "config.properties";
            String xmlFileName = "strings/strings.xml";

            utils.log().info("load " + propFileName);
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            props.load(inputStream);
            setProps(props);

            utils.log().info("load " + xmlFileName);
            stringsis = getClass().getClassLoader().getResourceAsStream(xmlFileName);
            setStrings(utils.parseStringXML(stringsis));

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", platformName);
            desiredCapabilities.setCapability("deviceName", deviceName);
            desiredCapabilities.setCapability("udid", udid);
            url = new URL(props.getProperty("appiumURL"));

            switch (platformName) {
                case "Android":
                    desiredCapabilities.setCapability("automationName", props.getProperty("androidAutomationName"));
                    desiredCapabilities.setCapability("appPackage", props.getProperty("androidAppPackage"));
                    desiredCapabilities.setCapability("appActivity", props.getProperty("androidAppActivity"));
                    if (emulator.equalsIgnoreCase("true")) {
                        desiredCapabilities.setCapability("avd", deviceName);
                        desiredCapabilities.setCapability("avdLaunchTimeout", 120000);
                    }
                    desiredCapabilities.setCapability("systemPort", systemPort);
                    desiredCapabilities.setCapability("chromeDriverPort", chromeDriverPort);
                    String androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                            + File.separator + "resources" + File.separator + "app" + File.separator + "base.apk";
//				String androidAppUrl = getClass().getResource(props.getProperty("androidAppLocation")).getFile();
                    utils.log().info("appUrl is" + androidAppUrl);
                    desiredCapabilities.setCapability("app", androidAppUrl);


                    driver = new AndroidDriver(url, desiredCapabilities);
                    break;
                case "iOS":
                    desiredCapabilities.setCapability("automationName", props.getProperty("iOSAutomationName"));
                    String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                            + File.separator + "resources" + File.separator + "app" + File.separator + "SwagLabsMobileApp.app";
//				String iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
                    utils.log().info("appUrl is" + iOSAppUrl);
                    desiredCapabilities.setCapability("bundleId", props.getProperty("iOSBundleId"));
                    desiredCapabilities.setCapability("wdaLocalPort", wdaLocalPort);
                    desiredCapabilities.setCapability("webkitDebugProxyPort", webkitDebugProxyPort);
                    desiredCapabilities.setCapability("app", iOSAppUrl);

                    driver = new IOSDriver(url, desiredCapabilities);
                    break;
                default:
                    throw new Exception("Invalid platform! - " + platformName);
            }
            setDriver(driver);
            utils.log().info("driver initialized: " + driver);
        } catch (Exception e) {
            utils.log().fatal("driver initialization failure. ABORT!!!\n" + e.toString());
            throw e;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (stringsis != null) {
                stringsis.close();
            }
        }
    }

    public static void waitForVisibility(WebElement e) {

        WebDriverWait wait = new WebDriverWait(getDriver(), TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForVisibility(WebElement e) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void clear(WebElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void click(WebElement e) {
        waitForVisibility(e);
        e.click();
    }

    public void click(WebElement e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        ExtentReportsSBIG.getTest().log(Status.INFO, msg);
        e.click();
    }

    public void sendKeys(WebElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public void sendKeys(WebElement e, String txt, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        ExtentReportsSBIG.getTest().log(Status.INFO, msg);
        e.sendKeys(txt);
    }

    public static String getAttribute(WebElement e, String attribute) {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    public static String getText(WebElement e, String msg) {
        String txt = null;
        switch (getPlatform()) {
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
        }
        utils.log().info(msg + txt);
        ExtentReportsSBIG.getTest().log(Status.INFO, msg + txt);
        return txt;
    }

    public void closeApp() {
        ((InteractsWithApps) getDriver()).closeApp();
    }

    public void launchApp() {
        ((InteractsWithApps) getDriver()).launchApp();
    }

    public WebElement scrollToElement(String elementTextName) {
        //return (WebElement) (AppiumBy.androidUIAutomator( getDriver()).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+elementTextName+"\").instance(0))");
        AppiumBy appiumDriver = null;
        return (WebElement) appiumDriver.findElement(
                (SearchContext) AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(10);"));
    }



    @AfterTest (alwaysRun = true)
    public void afterTest() throws InterruptedException {
        if(getDriver() != null){
            getDriver().wait();
        }
    }

    @AfterSuite
    public static void SendingMail() throws InterruptedException {
        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(new Thread() {
                              public void run(){
                                  ReportEmailSent sm = new ReportEmailSent();
                                  try {
                                      sm.mail();
                                      System.out.println("Report has been sent");
                                  } catch (IOException | MessagingException e) {
                                      e.printStackTrace();
                                  }

                              }
                          }
        );
        try{Thread.sleep(6000);}catch (Exception e)
        {
            System.out.println(e);
        }

        Thread.sleep(2000);
        System.out.println("***************Closing the Browser For Scenario****************");

    }
}
