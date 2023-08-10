package Pages.Health.ArogyaSanjeevani;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class InsuredDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    private AppiumDriver appiumDriver;
    @AndroidFindBy(accessibility = "Unmarried")
    private MobileElement MaritialStatusById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FIRST NAME']")
    private MobileElement FirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement LastNameByXpath;
    @AndroidFindBy(accessibility = "DOB\n" + "DD/MM/YYYY")
    private MobileElement DOBById;
    @AndroidFindBy(accessibility = "CONFIRM")
    private MobileElement ConfirmById;
    @AndroidFindBy(accessibility = "SAVE DETAILS")
    private MobileElement SaveDetaildById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;

    public InsuredDetails MaritialStatus(){
        click(MaritialStatusById);
        return this;
    }
    public InsuredDetails FirstName() throws InterruptedException {
        click(FirstNameByXpath);
        Thread.sleep(2000);
        sendKeys(FirstNameByXpath, "Abbc");
        return this;
    }
    public InsuredDetails LastName() throws InterruptedException {
        click(LastNameByXpath);
        Thread.sleep(2000);
        sendKeys(LastNameByXpath, "Bacca");
        return this;
    }
    public InsuredDetails DOB(){
        click(DOBById);
        return this;
    }
    public InsuredDetails Confirm(){
        click(ConfirmById);
        return this;
    }
    public InsuredDetails SaveDetails(){
        click(SaveDetaildById);
        return this;
    }
    public InsuredDetails Next(){
        click(NextById);
        return this;
    }
}
