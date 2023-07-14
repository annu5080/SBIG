package Pages.Health.ArogyaPremier;

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
    @AndroidFindBy(accessibility = "Arogya Premier")
    private MobileElement ArogyaPremierById;
    @AndroidFindBy(accessibility = "GET QUOTE")
    private MobileElement GetQuoteById;
    public IntroPage ArogyaPremier(){
        scrollToEnd();
        click(ArogyaPremierById);
        return this;
    }
    public IntroPage GetQuote(){
        click(GetQuoteById);
        return this;
    }
}
