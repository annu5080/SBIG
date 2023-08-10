package Pages.Health.ArogyaTopUp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class IntroPage extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    private AppiumDriver appiumDriver;
    @AndroidFindBy(accessibility = "Arogya Top Up")
    private MobileElement ArogyaTopUpById;
    @AndroidFindBy(accessibility = "GET QUOTE")
    private MobileElement GetQuoteById;
    public IntroPage ArogyaTopUp(){
        scrollToEnd();
        click(ArogyaTopUpById);
        return this;
    }
    public IntroPage GetQuote(){
        click(GetQuoteById);
        return this;
    }
}
