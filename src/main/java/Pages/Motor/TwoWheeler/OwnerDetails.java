package Pages.Motor.TwoWheeler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class OwnerDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    private AppiumDriver appiumDriver;
    @AndroidFindBy(accessibility = "Individual")
    private MobileElement OwnerTypeById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PAN NUMBER*']")
    private MobileElement PanNumberByXpath;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Details of Owner\n" +
            "OWNER TYPE\n" +
            "SELECT GENDER\n" +
            "Please ensure you submit your PAN correctly\n" +
            "I am not a Robot \"]/android.widget.ImageView[2]")
    private MobileElement GenderByXpath;
    @AndroidFindBy(accessibility = "DOB\n" +
            "DD/MM/YYYY")
    private MobileElement DOBById;
    @AndroidFindBy(accessibility = "CONFIRM")
    private MobileElement ConfirmById;

    //    @AndroidFindBy(xpath = "//android.widget.EditText[@text='GSTIN']")
//    private MobileElement GstinByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;

    public OwnerDetails OwnerType(){
        click(OwnerTypeById);
        return this;
    }
    public OwnerDetails Gender(){
        click(GenderByXpath);
        return this;
    }
    public OwnerDetails DOB(){
        click(DOBById);
        return this;
    }
    public OwnerDetails Confirm(){
        click(ConfirmById);
        return this;
    }
    public OwnerDetails PanNumber() throws InterruptedException {
        click(PanNumberByXpath);
        Thread.sleep(2000);
        sendKeys(PanNumberByXpath, "ABCDE1234F");
        Thread.sleep(2000);
        return this;
    }
    //    public OwnerDetails Gstin() throws InterruptedException {
//        click(GstinByXpath);
//        Thread.sleep(2000);
//        sendKeys(GstinByXpath, "");
//        Thread.sleep(2000);
//        return this;
//    }
    public OwnerDetails Next() throws InterruptedException {
        appiumDriver.navigate().back();
        scrollToEnd();
        Thread.sleep(6000);
        click(NextById);
        Thread.sleep(30000);
        return this;
    }
}
