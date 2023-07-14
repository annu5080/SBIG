package Pages.Health.PersonalAccident;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import qa.BaseTest;
import utils.TestUtils;

public class PolicyType extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    WebDriver driver;
    @AndroidFindBy(accessibility = "Individual\n" +
            "Get hospitalisation cover for you or your family member\n" +
            "Ideal for:  One family member")
    private MobileElement PolicyTypeById;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.widget.ImageView[2]")
    private MobileElement SelectGenderById;
    @AndroidFindBy(accessibility = "DD/MM/YYYY")
    private MobileElement DOBById;
    @AndroidFindBy(accessibility = "CONFIRM")
    private MobileElement ConfirmById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='OCCUPATION']")
    private MobileElement OccupationByXpath;
    @AndroidFindBy(accessibility = "Accountant")
    private MobileElement SelectOccupationById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='GROSS MONTHLY INCOME ']")
    private MobileElement GrossMonthlyIncomeByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"10\n" + "Lakhs\n" + "Premium - ₹630\"]")
    private MobileElement SumInsuredAmountByXpath;

//    @AndroidFindBy(accessibility = "Hospital Daily Cash Allowance\n" + "Get Hospital Confinement Allowance for Rs.1000/2000/3000 per day for maximum 15 days in the Policy\n" +
//            "period, if accident happens in India")
//    private MobileElement SelectAddOnById;
    @AndroidFindBy(accessibility = "PROCEED TO BUY")
    private MobileElement ProceedToBuyById;

    public PolicyType PolicyType(){
        click(PolicyTypeById);
        return this;
    }
    public PolicyType SelectGender(){
        click(SelectGenderById);
        return this;
    }
    public PolicyType DOB(){
        click(DOBById);
        return this;
    }
    public PolicyType Confirm(){
        click(ConfirmById);
        return this;
    }
    public PolicyType Occupation() throws InterruptedException {
        click(OccupationByXpath);
        Thread.sleep(3000);
        sendKeys(OccupationByXpath, "Ac");
        Thread.sleep(4000);
        return this;
    }
    public PolicyType SelectOccupation(){
        click(SelectOccupationById);
        return this;
    }
    public PolicyType GrossMonthlySalary() throws InterruptedException {
        click(GrossMonthlyIncomeByXpath);
        Thread.sleep(2000);
        sendKeys(GrossMonthlyIncomeByXpath, "200000");
        Thread.sleep(5000);
//        driver.navigate().back();
        return this;
    }
    public PolicyType Next(){
        click(NextById);
        return this;
    }
    public PolicyType SumInsuredAmount(){
        click(SumInsuredAmountByXpath);
        return this;
    }
//    public PolicyType AdditionalCoverage(){
//        click(SelectAddOnById);
//        return this;
//    }
    public PolicyType ProceedToBuy(){
        click(ProceedToBuyById);
        return this;
    }
}
