package Pages.Health.PersonalAccident;

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
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='MOBILE NUMBER']")
    private MobileElement MobileNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='EMAIL ADDRESS']")
    private MobileElement EmailAddressByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "New Delhi")
    private MobileElement SelectYourCityById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='My Pincode is\n" + "Pincode']")
    private MobileElement PincodeByXpath;
    @AndroidFindBy(accessibility = "110001")
    private MobileElement SelectPincodeById;

    public PersonalDetails MobileNumber(){
        sendKeys(MobileNumberByXpath, "9876543210");
        return this;
    }
    public PersonalDetails EmailAddress(){
        sendKeys(EmailAddressByXpath, "a@gmail.com");
        return this;
    }
    public PersonalDetails Next(){
        click(NextById);
        return this;
    }
    public PersonalDetails SelectCity() throws InterruptedException {
        Thread.sleep(10000);
        click(SelectYourCityById);
        Thread.sleep(50000);
        return this;
    }
    public PersonalDetails Pincode() throws InterruptedException {
        scrollToEnd();
        click(PincodeByXpath);
        Thread.sleep(3000);
        sendKeys(PincodeByXpath, "11000");
        Thread.sleep(6000);
        return this;
    }
    public PersonalDetails SelectPincode(){
        click(SelectPincodeById);
        return this;
    }
}
