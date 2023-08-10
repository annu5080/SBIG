package Pages.Home;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class CoveragePeriod extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    @AndroidFindBy(accessibility = "5\n" + "Years\n" + "Premium - ₹1,380")
    private MobileElement CoveragePeriodById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "PROCEED TO BUY")
    private MobileElement ProceedToBuyId;
    public CoveragePeriod CoveragePeriod() throws InterruptedException {
        Thread.sleep(20000);
        click(CoveragePeriodById);
        return this;
    }
    public CoveragePeriod Next(){
        click(NextById);
        return this;
    }
    public CoveragePeriod ProceedToBuy(){
        click(ProceedToBuyId);
        return this;
    }
}
