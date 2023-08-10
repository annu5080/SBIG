package Pages.CyberVaultEdge;

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
    @AndroidFindBy(accessibility = "CONTINUE")
    private MobileElement CoveragesById;
    @AndroidFindBy(accessibility = "Individual\n" + "Covers Single Person\n" + "Ideal for:  One family member")
    private MobileElement PolicyTypeById;
    @AndroidFindBy(accessibility = "Self*")
    private MobileElement SelfByid;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[3]")
    private MobileElement GenderByXpath;
    @AndroidFindBy(accessibility = "Age")
    private MobileElement AgeById;
    @AndroidFindBy(accessibility = "21 years")
    private MobileElement SelectAgeById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "Aggregate Sum Insured for all selected coverages\n" +
            "Kindly choose an overall Sum Insured for the chosen covers for you & your family")
    private MobileElement SumInsuredTypeById;
    @AndroidFindBy(accessibility = "₹5 Lakhs")
    private MobileElement SumInsuredAmountById;
    @AndroidFindBy(accessibility = "No")
    private MobileElement LoyaltyDiscountById;
    @AndroidFindBy(accessibility = "No")
    private MobileElement EmployeeDiscountById;
    @AndroidFindBy(accessibility = "CONTINUE")
    private MobileElement DiscountById;
    @AndroidFindBy(accessibility = "PROCEED TO BUY")
    private MobileElement ReviewQuoteById;

    public PolicyType Coverage(){
        click(CoveragesById);
        return this;
    }
    public PolicyType PolicyType(){
        click(PolicyTypeById);
        return this;
    }
    public PolicyType Self(){
        click(SelfByid);
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
    public PolicyType SumInsuredType(){
        click(SumInsuredTypeById);
        return this;
    }
    public PolicyType SumInsuredAmount(){
        click(SumInsuredAmountById);
        return this;
    }
    public PolicyType LoyaltyDiscount(){
        click(LoyaltyDiscountById);
        return this;
    }
    public PolicyType EmployeeDiscount() throws InterruptedException {
        Thread.sleep(2000);
        click(EmployeeDiscountById);
        return this;
    }
    public PolicyType Discount(){
        click(DiscountById);
        return this;
    }
    public PolicyType ReviewQuote(){
        click(ReviewQuoteById);
        return this;
    }
}
