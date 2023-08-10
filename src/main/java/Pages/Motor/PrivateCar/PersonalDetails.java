package Pages.Motor.PrivateCar;

import io.appium.java_client.AppiumDriver;
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
    private AppiumDriver appiumDriver;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='MOBILE NUMBER']")
    private MobileElement MobileNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='EMAIL ADDRESS']")
    private MobileElement EmailAddressByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;

    public PersonalDetails MobileNumber() throws InterruptedException {
        sendKeys(MobileNumberByXpath, "9876543210");
        return this;
    }
    public PersonalDetails EmailAddress() throws InterruptedException {
        click(EmailAddressByXpath);
        Thread.sleep(2000);
        sendKeys(EmailAddressByXpath, "a@gmail.com");
        Thread.sleep(2000);
        return this;
    }
    public PersonalDetails Next(){
        click(NextById);
        return this;
    }
}
