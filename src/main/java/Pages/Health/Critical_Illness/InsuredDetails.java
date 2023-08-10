package Pages.Health.Critical_Illness;

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
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FIRST NAME']")
    private MobileElement FirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement LastNameByXpath;
    @AndroidFindBy(accessibility = "DOB\n" + "DD/MM/YYYY")
    private MobileElement DOBById;
    @AndroidFindBy(accessibility = "CONFIRM")
    private MobileElement ConfirmById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='(Feet)']")
    private MobileElement FeetByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='(Inches)']")
    private MobileElement InchesByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='WEIGHT(KG)']")
    private MobileElement WeightByXpath;
    @AndroidFindBy(accessibility = "SAVE DETAILS")
    private MobileElement SaveDetailsById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;

    public InsuredDetails FirstName() throws InterruptedException {
        click(FirstNameByXpath);
        Thread.sleep(2000);
        sendKeys(FirstNameByXpath, "Annu");
        Thread.sleep(2000);
        return this;
    }
    public InsuredDetails LastName() throws InterruptedException {
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
    public InsuredDetails Feet() throws InterruptedException {
        click(FeetByXpath);
        Thread.sleep(2000);
        sendKeys(FeetByXpath, "5");
        Thread.sleep(2000);
        return this;
    }
    public InsuredDetails Inches() throws InterruptedException {
        click(InchesByXpath);
        Thread.sleep(2000);
        sendKeys(InchesByXpath, "7");
        Thread.sleep(2000);
        return this;
    }
    public InsuredDetails Weight() throws InterruptedException {
        click(WeightByXpath);
        Thread.sleep(2000);
        sendKeys(WeightByXpath, "50");
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        return this;
    }
    public InsuredDetails SaveDetails(){
        click(SaveDetailsById);
        return this;
    }
    public InsuredDetails Next(){
        click(NextById);
        return this;
    }
}
