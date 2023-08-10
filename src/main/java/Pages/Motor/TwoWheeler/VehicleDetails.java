package Pages.Motor.TwoWheeler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class VehicleDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    private AppiumDriver appiumDriver;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Do you hold a valid two wheeler insurance policy?\n" + "POLICY EXPIRY DATE\n" +
            "POLICY TYPE\n" + "Have you made a claim in your current/expiring Policy?\"]/android.widget.ImageView")
    private MobileElement PolicyExpiryDateByXpath;
    @AndroidFindBy(accessibility = "CONFIRM")
    private MobileElement ConfirmById;
    @AndroidFindBy(accessibility = "COMPREHENSIVE")
    private MobileElement PolicyTypeById;
    @AndroidFindBy(accessibility = "0%")
    private MobileElement NCBById;
    @AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
    private MobileElement CongratulationByXpath;
    @AndroidFindBy(accessibility = "SEE PLANS")
    private MobileElement SeePlansById;

    public VehicleDetails Next(){
        click(NextById);
        return this;
    }
    public VehicleDetails PolicyExpiryDate(){
        click(PolicyExpiryDateByXpath);
        return this;
    }
    public VehicleDetails Confirm(){
        click(ConfirmById);
        return this;
    }
    public VehicleDetails PolicyType(){
        click(PolicyTypeById);
        return this;
    }
    public VehicleDetails NCB(){
        scrollToEnd();
        click(NCBById);
        return this;
    }
    public VehicleDetails NCBPopUp(){
        click(CongratulationByXpath);
        return this;
    }
    public VehicleDetails SeePlans(){
        click(SeePlansById);
        return this;
    }
}
