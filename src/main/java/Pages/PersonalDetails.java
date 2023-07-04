package Pages;

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
    private MobileElement EmailIdXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='My Pincode is']")
    private MobileElement PincodeByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "110001")
    private MobileElement SelectPincodeBYId;

    public PersonalDetails MobileNumber(){
        sendKeys(MobileNumberByXpath, "9876543210");
        return this;
    }
    public PersonalDetails EmailId(){
        sendKeys(EmailIdXpath, "a@gmail.com");
        return this;
    }
    public PersonalDetails Next() throws InterruptedException{
        click(NextById);
        Thread.sleep(3000);
        return this;
    }
    public PersonalDetails PinCode()throws InterruptedException{
        click(PincodeByXpath);
        Thread.sleep(2000);
        click(PincodeByXpath);
        sendKeys(PincodeByXpath, "110");
        Thread.sleep(2000);
        return this;
    }
    public PersonalDetails SelectPincode(){
        click(SelectPincodeBYId);
        return this;
    }
}
