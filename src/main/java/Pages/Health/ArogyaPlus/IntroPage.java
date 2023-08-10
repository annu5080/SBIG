package Pages.Health.ArogyaPlus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import qa.BaseTest;
import utils.TestUtils;

import java.net.URL;

public class IntroPage extends BaseTest {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    private AppiumDriver appiumDriver;

    @AndroidFindBy(accessibility = "Arogya Plus")
    private MobileElement ArogyaPlusById;
    @AndroidFindBy(accessibility = "GET QUOTE")
    private MobileElement GetQuoteById;


    public IntroPage ArogyaPlus() throws InterruptedException {
//        scrollTo("Arogya Plus");
//        appiumDriver.navigate().back();
//        scroll();
        //((FindsByAndroidUIAutomator) getDriver()).findElementByAndroidUIAutomator(
             //   "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Arogya Plus\").instance(0))");

        Thread.sleep(2000);
        click(ArogyaPlusById);
        return this;
    }
    public IntroPage GetQuote(){
        click(GetQuoteById);
        return this;
    }

}
