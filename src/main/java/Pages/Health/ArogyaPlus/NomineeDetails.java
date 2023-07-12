package Pages.Health.ArogyaPlus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class NomineeDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    AppiumDriver driver;
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='3']")
    private MobileElement GenderByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FIRST NAME']")
    private MobileElement FirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement LastNameByXpath;
    @AndroidFindBy(accessibility = "Relation with primary insured")
    private MobileElement SelectRelationById;
    @AndroidFindBy(accessibility = "Mother")
    private MobileElement MotherById;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"DOB\n" +
            "DD/MM/YYYY\"]")
    private MobileElement DOBByXpath;
    @AndroidFindBy(accessibility = "2023")
    private MobileElement SelectYearById;
    @AndroidFindBy(accessibility = "1985")
    private MobileElement YearById;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"CONFIRM\"]")
    private MobileElement ConfirmByXpath;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"NEXT\"]")
    private MobileElement NextByXapth;
    @AndroidFindBy(accessibility = "No")
    private MobileElement EIANumberById;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='3']")
    private MobileElement SelectEIANumberByXpath;
    @AndroidFindBy(accessibility = "DONE")
    private MobileElement DoneById;
    @AndroidFindBy(accessibility = "Proceed with KYC")
    private MobileElement ProceedWithKYCById;

    public NomineeDetails Gender(){
        click(GenderByXpath);
        return this;
    }
    public NomineeDetails FirstName(){
        sendKeys(FirstNameByXpath, "Hello");
        return this;
    }
    public NomineeDetails LastName() throws InterruptedException {
        click(LastNameByXpath);
        Thread.sleep(2000);
        sendKeys(LastNameByXpath, "World");
        Thread.sleep(2000);
        return this;
    }
    public NomineeDetails SelectRelation() throws InterruptedException {
//        driver.navigate().back();
        Thread.sleep(4000);
        click(SelectRelationById);
        return this;
    }
    public NomineeDetails Mother(){
        click(MotherById);
        return this;
    }
    public NomineeDetails DOB() throws InterruptedException {
//        driver.navigate().back();
        Thread.sleep(4000);
        scrollToEnd();
        click(DOBByXpath);
        return this;
    }
    public NomineeDetails SelectYear() throws InterruptedException {
//        click(SelectYearById);
        Thread.sleep(5000);
        return this;
    }
    public NomineeDetails Year(){
        click(YearById);
        return this;
    }
    public NomineeDetails Confirm(){
        click(ConfirmByXpath);
        return this;
    }
    public NomineeDetails Next() throws InterruptedException {
        click(NextByXapth);
        Thread.sleep(4000);
        return this;
    }
    public NomineeDetails EIANumber(){
        click(EIANumberById);
        return this;
    }
    public NomineeDetails SelectEIANumber(){
        click(SelectEIANumberByXpath);
        return this;
    }
    public NomineeDetails Done() throws InterruptedException {
        scrollToEnd();
        Thread.sleep(5000);
        scrollToEnd();
        click(DoneById);
        return this;
    }
    public NomineeDetails ProceedWithKYC(){
        click(ProceedWithKYCById);
        return this;
    }
}
