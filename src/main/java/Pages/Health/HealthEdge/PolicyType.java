package Pages.Health.HealthEdge;

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
    @AndroidFindBy(accessibility = "Individual\nSingle member to have an Individual Sum Insured.\nIdeal for:  Single Person")
    private MobileElement PolicyTypeById;
    @AndroidFindBy(accessibility = "Self")
    private MobileElement InsuredDetailsById;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='4']")
    private MobileElement GenderByXpath;
    @AndroidFindBy(accessibility = "Age")
    private MobileElement AgeById;
    @AndroidFindBy(accessibility = "22 years")
    private MobileElement SelectAgeById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "COMPARE ALL PLANS")
    private MobileElement CompareById;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Select\"])[1]")
    private MobileElement SelectByXpath;
    @AndroidFindBy(accessibility = "Proceed")
    private MobileElement ProceedById;
    @AndroidFindBy(accessibility = "₹3 Lakhs")
    private MobileElement SumInsuredAmountById;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"1 Year\n" + "₹5,091\"]")
    private MobileElement SelectTimePeriodByXpath;
    @AndroidFindBy(accessibility = "PROCEED TO BUY")
    private MobileElement ProceedToBuyById;

    public PolicyType PolicyType(){
        click(PolicyTypeById);
        return this;
    }
    public PolicyType InsuredDetails(){
        click(InsuredDetailsById);
        return this;
    }
    public PolicyType Gender(){
        click(GenderByXpath);
        return this;
    }
    public PolicyType Age(){
        click(AgeById);
        return this;
    }
    public PolicyType SelectAge(){
        click(SelectAgeById);
        return this;
    }
    public PolicyType Next() throws InterruptedException {
        click(NextById);
        Thread.sleep(4000);
        return this;
    }
    public PolicyType Compare(){
        click(CompareById);
        return this;
    }
    public PolicyType Select() throws InterruptedException {
        Thread.sleep(2000);
        click(SelectByXpath);
        return this;
    }
    public PolicyType Proceed(){
        click(ProceedById);
        return this;
    }
    public PolicyType SumInsuredAmount(){
        click(SumInsuredAmountById);
        return this;
    }
    public PolicyType SelectTimePeriod() throws InterruptedException {
        Thread.sleep(2000);
        click(SelectTimePeriodByXpath);
        return this;
    }
    public PolicyType ProceedToBuy(){
        click(ProceedToBuyById);
        return this;
    }
}
