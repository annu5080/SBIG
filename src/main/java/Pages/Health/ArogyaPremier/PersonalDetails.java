package Pages.Health.ArogyaPremier;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class PersonalDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath ="//android.widget.EditText[@text='MOBILE NUMBER']" )
    private MobileElement MobileNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='EMAIL ADDRESS']")
    private MobileElement EmailAddressByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;

    public PersonalDetails MobileNumber(){
        sendKeys(MobileNumberByXpath, "9876543210");
        return this;
    }
    public PersonalDetails EmailAddress() throws InterruptedException {
        sendKeys(EmailAddressByXpath, "a@gmail.com");
        Thread.sleep(2000);
        return this;
    }
    public PersonalDetails Next(){
        click(NextById);
        return this;
    }
}
