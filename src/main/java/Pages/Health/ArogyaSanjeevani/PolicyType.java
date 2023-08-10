package Pages.Health.ArogyaSanjeevani;

import io.appium.java_client.AppiumDriver;
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
    private AppiumDriver appiumDriver;
    @AndroidFindBy(accessibility = "Individual\n" + "Get financial protection with affordable premium\n" + "Ideal for:  One family member")
    private MobileElement PolicyTypeById;
    @AndroidFindBy(accessibility = "Self")
    private MobileElement SelfById;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[3]")
    private MobileElement GenderByXpath;
    @AndroidFindBy(accessibility = "Age")
    private MobileElement AgeById;
    @AndroidFindBy(accessibility = "21 years")
    private MobileElement SelectAgeById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"3\n" + "Lakhs\n" + "Premium - ₹3,427\"]")
    private MobileElement SumInsuredAmountByXpath;
    @AndroidFindBy(accessibility = "PROCEED TO BUY")
    private MobileElement ProceedToBuyById;

    public PolicyType PolicyType(){
        click(PolicyTypeById);
        return this;
    }
    public PolicyType Self(){
        click(SelfById);
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
    public PolicyType Next(){
        click(NextById);
        return this;
    }
    public PolicyType SumInsuredDetails(){
        click(SumInsuredAmountByXpath);
        return this;
    }
    public PolicyType ProceedToBuy(){
        click(ProceedToBuyById);
        return this;
    }
}