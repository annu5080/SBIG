package Pages.Health.HealthEdge;

import Pages.HealthEdge.HEHomeScreen;
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
    @AndroidFindBy(accessibility = "Health Edge")
    private MobileElement HealthEdgeById;
    @AndroidFindBy(accessibility = "Skip Now")
    private MobileElement SkipNowById;
    @AndroidFindBy(accessibility = "GET QUOTE")
    private MobileElement GetQuoteById;
    public IntroPage HealthEdge() throws InterruptedException {
        click(HealthEdgeById);
        Thread.sleep(2000);
        return this;
    }
    public IntroPage SkipNow(){
        click(SkipNowById);
        return this;
    }
    public IntroPage GetQuote() throws InterruptedException {
        Thread.sleep(3000);
        scrollToEnd();
        click(GetQuoteById);
        return this;
    }
}
