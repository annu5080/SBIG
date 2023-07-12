package Pages.Health.ArogyaSupreme;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class InsuredDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    @AndroidFindBy(accessibility = "Self")
    private MobileElement SelfById;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='4']")
    private MobileElement IdGenderByXpath;
    @AndroidFindBy(accessibility = "Age")
    private MobileElement IDAgeById;
    @AndroidFindBy(accessibility = "22 years")
    private MobileElement SelectAgeById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement IDNextById;
    @AndroidFindBy(accessibility = "₹3 Lakhs")
    private MobileElement SumInsuredAmountById;
    @AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
    private MobileElement CoveragePackageByXpath;
    @AndroidFindBy(accessibility = "1 Year\n₹7,043")
    private MobileElement CoveragePeriodById;
    @AndroidFindBy(accessibility = "PROCEED TO BUY")
    private MobileElement ReviewQuoteById;
    @AndroidFindBy(accessibility = "Unmarried")
    private MobileElement UnmarriedById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FIRST NAME']")
    private MobileElement IDFirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement IDLastNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='4']")
    private MobileElement IDDOBByXpath;
    @AndroidFindBy(accessibility = "CONFIRM")
    private MobileElement IDConfirmById;
    @AndroidFindBy(accessibility = "SAVE DETAILS")
    private MobileElement IDSaveDetailsById;
    public InsuredDetails Self(){
        click(SelfById);
        return this;
    }
    public InsuredDetails IDGender(){
        click(IdGenderByXpath);
        return this;
    }
    public InsuredDetails IDAge(){
        click(IDAgeById);
        return this;
    }
    public InsuredDetails SelectIDAge(){
        click(SelectAgeById);
        return this;
    }
    public InsuredDetails IDNext(){
        click(IDNextById);
        return this;
    }
    public InsuredDetails SumInsuredAmount(){
        click(SumInsuredAmountById);
        return this;
    }
    public InsuredDetails CoveragePackage(){
        click(CoveragePackageByXpath);
        return this;
    }
    public InsuredDetails CoveragePeriod(){
        click(CoveragePeriodById);
        return this;
    }
    public InsuredDetails ReviewQuote(){
        click(ReviewQuoteById);
        return this;
    }
    public InsuredDetails Unmarried(){
        click(UnmarriedById);
        return this;
    }
    public InsuredDetails IDFirstName() throws InterruptedException {
        click(IDFirstNameByXpath);
        Thread.sleep(2000);
        sendKeys(IDFirstNameByXpath, "Annu");
        Thread.sleep(2000);
        return this;
    }
    public InsuredDetails IDLastName() throws InterruptedException {
        click(IDLastNameByXpath);
        Thread.sleep(2000);
        sendKeys(IDLastNameByXpath, "Shaw");
        Thread.sleep(2000);
        return this;
    }
    public InsuredDetails IDDOB() throws InterruptedException {
        Thread.sleep(2000);
        click(IDDOBByXpath);
        return this;
    }
    public InsuredDetails IDConfirm(){
        click(IDConfirmById);
        return this;
    }
    public InsuredDetails IDSaveDetails(){
        click(IDSaveDetailsById);
        return this;
    }
}
