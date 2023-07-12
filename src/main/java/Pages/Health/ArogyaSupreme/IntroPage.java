package Pages.Health.ArogyaSupreme;

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
    @AndroidFindBy(accessibility = "Arogya Supreme")
    private MobileElement ArogyaSupremeById;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"NEXT\"]")
    private MobileElement NextByXpath;
    @AndroidFindBy(accessibility = "OK, GOT IT")
    private MobileElement OkGotItById;
    @AndroidFindBy(accessibility = "GET QUOTE")
    private MobileElement GetQuoteById;

    public IntroPage ArogyaSupreme(){
        click(ArogyaSupremeById);
        return this;
    }
    public IntroPage next(){
        click(NextByXpath);
        return this;
    }
    public IntroPage OKGotIt(){
        click(OkGotItById);
        return this;
    }
    public IntroPage GetQuote(){
        click(GetQuoteById);
        return this;
    }
}
