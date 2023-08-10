package Pages.CyberVaultEdge;

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
    private MobileElement MobileNumberBYXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='EMAIL ADDRESS']")
    private MobileElement EmailAddressByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;

    public PersonalDetails MobileNumber(){
        sendKeys(MobileNumberBYXpath, "9876543210");
        return this;
    }
    public PersonalDetails EmailAddress() throws InterruptedException{
        click(EmailAddressByXpath);
        Thread.sleep(2000);
        sendKeys(EmailAddressByXpath, "a@gmail.com");
        return this;
    }
    public PersonalDetails Next(){
        click(NextById);
        return this;
    }
}
