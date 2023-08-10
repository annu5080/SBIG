package Pages.Health.ArogyaTopUp;

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
    TestUtils utils = new TestUtils();
    private AppiumDriver appiumDriver;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Nominee Details\n" +
            "In the event of accident/ loss of life to the policyholder, the 'Nominee' is the person who receives claim compensation.\n" +
            "Nominee is one of the Insured Member\n" +
            "Nominee other than Insured Member\n" +
            "SELECT GENDER\n" +
            "Did you know, you can get cashless hospitalization facility with SBI General Arogya Top Up\"]/android.widget.ImageView[2]")
    private MobileElement NomineeGenderByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FIRST NAME']")
    private MobileElement FirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement LastNameByXpath;
    @AndroidFindBy(accessibility = "Relation with primary insured")
    private MobileElement NomineeRelationById;
    @AndroidFindBy(accessibility = "Mother")
    private MobileElement SelectRelationById;
    @AndroidFindBy(accessibility = "DOB\n" + "DD/MM/YYYY")
    private MobileElement NomineeDOBById;
    @AndroidFindBy(accessibility = "2023")
    private MobileElement YearById;
    @AndroidFindBy(accessibility = "1985")
    private MobileElement SelectYearById;
    @AndroidFindBy(accessibility = "CONFIRM")
    private MobileElement ConfirmById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='3']")
    private MobileElement SelectEIANumberByXpath;
    @AndroidFindBy(accessibility = "DONE")
    private MobileElement DoneById;
    @AndroidFindBy(accessibility = "Proceed with KYC")
    private MobileElement ProceedWithKYCById;
    public NomineeDetails NomineeGender(){
        click(NomineeGenderByXpath);
        return this;
    }
    public NomineeDetails FirstName() throws InterruptedException {
        click(FirstNameByXpath);
        Thread.sleep(2000);
        sendKeys(FirstNameByXpath, "Hello");
        Thread.sleep(2000);
        return this;
    }
    public NomineeDetails LastName() throws InterruptedException {
        click(LastNameByXpath);
        Thread.sleep(2000);
        sendKeys(LastNameByXpath, "Hola");
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        return this;
    }
    public NomineeDetails NomineeRelation(){
        click(NomineeRelationById);
        return this;
    }
    public NomineeDetails SelectRelation(){
        click(SelectRelationById);
        appiumDriver.navigate().back();
        scrollToEnd();
        return this;
    }
    public NomineeDetails DOB(){
        click(NomineeDOBById);
        return this;
    }
    public NomineeDetails Year() throws InterruptedException {
        click(YearById);
        Thread.sleep(10000);
        return this;
    }
    public NomineeDetails SelectYear(){
        click(SelectYearById);
        return this;
    }
    public NomineeDetails Confirm(){
        click(ConfirmById);
        return this;
    }
    public NomineeDetails Next(){
        click(NextById);
        return this;
    }
    public NomineeDetails SelectEIANumber(){
        click(SelectEIANumberByXpath);
        return this;
    }
    public NomineeDetails Done() throws InterruptedException {
        scrollToEnd();
        Thread.sleep(4000);
        click(DoneById);
        return this;
    }
    public NomineeDetails ProceedWithKYC(){
        click(ProceedWithKYCById);
        return this;
    }
}
