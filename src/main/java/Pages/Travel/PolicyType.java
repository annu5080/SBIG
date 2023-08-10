package Pages.Travel;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class PolicyType extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    @AndroidFindBy(accessibility = "$1\n" + "Lakh\n" + "Premium - ₹609")
    private MobileElement CoverageAmountById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "PROCEED TO BUY")
    private MobileElement ProceedToBuyById;
    public PolicyType CoverageAmount(){
        click(CoverageAmountById);
        return this;
    }
    public PolicyType Next(){
        click(NextById);
        return this;
    }
    public PolicyType ProceedToBuy(){
        click(ProceedToBuyById);
        return this;
    }
}
