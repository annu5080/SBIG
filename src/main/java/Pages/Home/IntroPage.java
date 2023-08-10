package Pages.Home;

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
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "OK, GOT IT")
    private MobileElement OkGotIt;
    @AndroidFindBy(accessibility = "GET QUOTE")
    private MobileElement GetQuoteById;

    public IntroPage Next() throws InterruptedException {
        click(NextById);
        Thread.sleep(2000);
        return this;
    }
    public IntroPage OkGotIt(){
        click(OkGotIt);
        return this;
    }
    public IntroPage GetQuote(){
        click(GetQuoteById);
        return this;
    }
}
