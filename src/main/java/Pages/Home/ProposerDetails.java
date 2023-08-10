package Pages.Home;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class ProposerDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"SELECT GENDER\n" +
            "Please ensure you submit your PAN correctly\"]/android.widget.ImageView[2]")
    private MobileElement GenderByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FIRST NAME']")
    private MobileElement FirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement LastNameByXpath;
    @AndroidFindBy(accessibility = "DOB")
    private MobileElement DOBById;
    @AndroidFindBy(accessibility = "CONFIRM")
    private MobileElement ConfirmById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PAN NUMBER*']")
    private MobileElement PanNumberByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "No")
    private MobileElement EIANumberById;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='3']")
    private MobileElement SelectEIANumberByXpath;
    @AndroidFindBy(accessibility = "DONE")
    private MobileElement DoneById;
    @AndroidFindBy(accessibility = "VERIFY OTP")
    private MobileElement VerifyOtpById;

    public ProposerDetails Gender(){
        click(GenderByXpath);
        return this;
    }
    public ProposerDetails FirstName() throws InterruptedException {
        click(FirstNameByXpath);
        Thread.sleep(2000);
        sendKeys(FirstNameByXpath, "Abbc");
        Thread.sleep(2000);
        back();
        return this;
    }
    public ProposerDetails LastName() throws InterruptedException {
        click(LastNameByXpath);
        Thread.sleep(2000);
        sendKeys(LastNameByXpath, "Baccca");
        Thread.sleep(2000);
        back();
        return this;
    }
    public ProposerDetails DOB(){
        click(DOBById);
        return this;
    }
    public ProposerDetails Confirm(){
        click(ConfirmById);
        return this;
    }
    public ProposerDetails PanNumber() throws InterruptedException {
        click(PanNumberByXpath);
        Thread.sleep(2000);
        sendKeys(PanNumberByXpath, "ABCDE1234F");
        Thread.sleep(2000);
        back();
        return this;
    }
    public ProposerDetails Next() throws InterruptedException {
        scrollToEnd();
        Thread.sleep(6000);
        click(NextById);
        Thread.sleep(20000);
        return this;
    }
    public ProposerDetails NextAddress(){
        click(NextById);
        return this;
    }
    public ProposerDetails EIANumber(){
        click(EIANumberById);
        return this;
    }
    public ProposerDetails SelectEIANumber(){
        click(SelectEIANumberByXpath);
        return this;
    }
    public ProposerDetails Done(){
//        scrollToEnd();
        click(DoneById);
        return this;
    }
    public ProposerDetails VerifyOTP() throws InterruptedException {
        click(VerifyOtpById);
        Thread.sleep(20000);
        return this;
    }
}