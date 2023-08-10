package Pages.Home;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class ContactDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FIRST NAME']")
    private MobileElement FirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement LastNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='MOBILE NUMBER']")
    private MobileElement MobileNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='EMAIL ADDRESS']")
    private MobileElement EmailAddressByXpath;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"I accept to \"]/android.view.View[2]")
    private MobileElement TermsandConditionByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;

    public ContactDetails FirstName() throws InterruptedException {
        click(FirstNameByXpath);
        Thread.sleep(2000);
        sendKeys(FirstNameByXpath, "Abbc");
        Thread.sleep(2000);
        return this;
    }
    public ContactDetails LastName() throws InterruptedException {
        click(LastNameByXpath);
        Thread.sleep(2000);
        sendKeys(LastNameByXpath, "Abbc");
        Thread.sleep(2000);
        return this;
    }
    public ContactDetails MobileNumber() throws InterruptedException {
        click(MobileNumberByXpath);
        Thread.sleep(2000);
        sendKeys(MobileNumberByXpath, "9876543210");
        Thread.sleep(2000);
        back();
        return this;
    }
    public ContactDetails EmailAddress() throws InterruptedException {
        click(EmailAddressByXpath);
        Thread.sleep(2000);
        sendKeys(EmailAddressByXpath, "a@gmail.com");
        Thread.sleep(2000);
        back();
        return this;
    }
    public ContactDetails TermsandConditions(){
        click(TermsandConditionByXpath);
        return this;
    }
    public ContactDetails Next(){
        click(NextById);
        return this;
    }
}
