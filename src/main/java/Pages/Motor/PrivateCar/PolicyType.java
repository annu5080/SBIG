package Pages.Motor.PrivateCar;

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
    @AndroidFindBy(accessibility = "COMPARE PLANS")
    private MobileElement ComparePlansById;
    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"BUY \"])[1]")
    private MobileElement BuyByXpath;
    @AndroidFindBy(accessibility = "PROCEED WITH PLAN A")
    private MobileElement PlanTypeById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "PROCEED TO BUY")
    private MobileElement ProceedToBuyById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='INSURANCE COMPANY']")
    private MobileElement InsuranceCompanyByXpath;
    @AndroidFindBy(accessibility = "Care Health Insurance Ltd(formerly known as Religare Health Insurance Co. Ltd.)")
    private MobileElement SelectInsuranceCompany;
    public PolicyType ComparePlans(){
        click(ComparePlansById);
        return this;
    }
    public PolicyType Buy(){
        scrollToEnd();
        click(BuyByXpath);
        return this;
    }
    public PolicyType PlanType(){
        click(PlanTypeById);
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
    public PolicyType InsuranceCompany() throws InterruptedException {
        click(InsuranceCompanyByXpath);
        Thread.sleep(2000);
        sendKeys(InsuranceCompanyByXpath, "Care");
        Thread.sleep(2000);
        return this;
    }
    public PolicyType SelectInsuranceCompany(){
        click(SelectInsuranceCompany);
        return this;
    }
}
