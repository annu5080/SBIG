package Pages.Health.HealthEdge;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class NomineeDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    AndroidDriver driver;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='3']")
    private MobileElement GenderByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FIRST NAME']")
    private MobileElement FirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement LastNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Relation with primary insured\"]")
    private MobileElement NomineeRelationByXpath;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Mother\"]")
    private MobileElement MotherByXpath;
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
    private MobileElement SelectEIAByXpath;
    public NomineeDetails Gender() throws InterruptedException {
        click(GenderByXpath);
        Thread.sleep(2000);
        return this;
    }
    public NomineeDetails FirstName() throws InterruptedException {
        click(FirstNameByXpath);
        Thread.sleep(2000);
        sendKeys(FirstNameByXpath, "Hello");
        return this;
    }
    public NomineeDetails LastName() throws InterruptedException {
        click(LastNameByXpath);
        Thread.sleep(2000);
        sendKeys(LastNameByXpath, "World");
//        driver.navigate().back();
        return this;
    }
    public NomineeDetails NomineeRelation(){
        click(NomineeRelationByXpath);
        return this;
    }
    public NomineeDetails Mother() throws InterruptedException {
        click(MotherByXpath);
        Thread.sleep(4000);
//        driver.navigate().back();
        return this;
    }
    public NomineeDetails DOB(){
        scrollToEnd();
        click(DOBByXpath);
        return this;
    }
    public NomineeDetails SelectYear() throws InterruptedException {
        click(SelectYearById);
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
    public NomineeDetails Next(){
        click(NextByXapth);
        return this;
    }
    public NomineeDetails EIANumber(){
        click(EIANumberById);
        return this;
    }
    public NomineeDetails SelectEIA(){
        click(SelectEIAByXpath);
        return this;
    }
}
