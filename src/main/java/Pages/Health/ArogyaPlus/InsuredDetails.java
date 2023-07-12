package Pages.Health.ArogyaPlus;

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
    @AndroidFindBy(accessibility = "Self\n" + "F, 21\n" + "Name, DOB\n" + "Marital Status")
    private MobileElement InsuredDetailsSelfById;
    @AndroidFindBy(accessibility = "Unmarried")
    private MobileElement MaritialStatusById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='First Name']")
    private MobileElement FirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Last Name']")
    private MobileElement LastNameByXpath;
    @AndroidFindBy(accessibility = "DOB\n" + "DD/MM/YYYY")
    private MobileElement DOBById;
    @AndroidFindBy(accessibility = "CONFIRM")
    private MobileElement ConfirmById;
    @AndroidFindBy(accessibility = "SAVE DETAILS")
    private MobileElement SaveDetailsById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;

    public InsuredDetails Self() throws InterruptedException {
        click(InsuredDetailsSelfById);
        Thread.sleep(2000);
        return this;
    }
    public InsuredDetails MaritialStatus(){
        click(MaritialStatusById);
        return this;
    }
    public InsuredDetails FirstName() throws InterruptedException {
        sendKeys(FirstNameByXpath, "Annu");
        Thread.sleep(2000);
        return this;
    }
    public InsuredDetails LastName() throws InterruptedException{
        click(LastNameByXpath);
        Thread.sleep(2000);
        sendKeys(LastNameByXpath, "Shaw");
        Thread.sleep(2000);
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
        click(SaveDetailsById);
        return this;
    }
    public InsuredDetails Next() throws InterruptedException {
        click(NextById);
        Thread.sleep(4000);
        return this;
    }
}
