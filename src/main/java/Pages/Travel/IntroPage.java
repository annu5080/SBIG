package Pages.Travel;

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
    @AndroidFindBy(accessibility = "GET QUOTE")
    private MobileElement GetQuoteById;

    public IntroPage GetQuote(){
        click(GetQuoteById);
        return this;
    }
}
