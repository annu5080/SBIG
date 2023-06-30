package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import qa.BaseTest;
import utils.TestUtils;

public class NomineeDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    WebDriver driver;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='3']")
    private MobileElement NDGenderByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FIRST NAME']")
    private MobileElement NDFirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement NDLastNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Relation with primary insured\"]")
    private MobileElement NomineeRelationByXpath;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Mother\"]")
    private MobileElement MotherByXpath;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"DOB\n" +
            "DD/MM/YYYY\"]")
    private MobileElement NDOBByXpath;
    @AndroidFindBy(accessibility = "2023")
    private MobileElement SelectYearById;
    @AndroidFindBy(accessibility = "1985")
    private MobileElement YearById;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"CONFIRM\"]")
    private MobileElement NDConfirmByXpath;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"NEXT\"]")
    private MobileElement NDNextByXapth;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"No\"]")
    private MobileElement EIANumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='3']")
    private MobileElement EIANumber1ByXpath;
    public NomineeDetails NDGender() throws InterruptedException {
        click(NDGenderByXpath);
        Thread.sleep(2000);
        return this;
    }
    public NomineeDetails NDFirstName() throws InterruptedException {
        click(NDFirstNameByXpath);
        Thread.sleep(2000);
        sendKeys(NDFirstNameByXpath, "Hello");
        return this;
    }
    public NomineeDetails NDLastName() throws InterruptedException {
        click(NDLastNameByXpath);
        Thread.sleep(2000);
        sendKeys(NDLastNameByXpath, "World");
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
        scrollToEnd();
        return this;
    }
    public NomineeDetails NDOB(){
        click(NDOBByXpath);
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
        click(NDConfirmByXpath);
        return this;
    }
    public NomineeDetails NDNext(){
        click(NDNextByXapth);
        return this;
    }
    public NomineeDetails EIANumber(){
        click(EIANumberByXpath);
        return this;
    }
    public NomineeDetails EIANumber1(){
        click(EIANumber1ByXpath);
        return this;
    }
}
