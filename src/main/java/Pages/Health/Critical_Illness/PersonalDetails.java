package Pages.Health.Critical_Illness;

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

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public void setAppiumDriver(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver MobileNumber(){
        sendKeys(MobileNumberByXpath, "9876543210");
        appiumDriver.navigate().back();
        return appiumDriver;
    }
    public PersonalDetails EmailAddress() throws InterruptedException {
        sendKeys(EmailAddressByXpath, "a@gmail.com");
        return this;
    }
    public PersonalDetails Next(){
        click(NextById);
        return this;
    }
}
