package Pages.Health.PersonalAccident;

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
    @AndroidFindBy(accessibility = "Personal Accident")
    private MobileElement PersonalAccidentById;
    @AndroidFindBy(accessibility = "GET QUOTE")
    private MobileElement GetQuoteById;

    public IntroPage PersonalAccident() throws InterruptedException {
        Thread.sleep(2000);
        scrollToEnd();
        click(PersonalAccidentById);
        return this;
    }
    public IntroPage GetQuote(){
        click(GetQuoteById);
        return this;
    }
}
