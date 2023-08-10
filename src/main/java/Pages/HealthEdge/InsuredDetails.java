package Pages.HealthEdge;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class InsuredDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    AndroidDriver driver;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Self\n" + "F, 22\n" + "Name\n" + "DOB\n" + "Marital Status\"]")
    private MobileElement SelfByXpath;
    @AndroidFindBy(accessibility = "Unmarried")
    private MobileElement MaritialStatusById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FIRST NAME']")
    private MobileElement FirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement LastNameByXpath;
    @AndroidFindBy(accessibility = "DOB\nDD/MM/YYYY")
    private MobileElement DOBById;
    @AndroidFindBy(accessibility = "CONFIRM")
    private MobileElement ConfirmById;
    @AndroidFindBy(accessibility = "Type of Occupation")
    private MobileElement OccupationById;
    @AndroidFindBy(accessibility = "Self Employed")
    private MobileElement SelectOccupationById;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.widget.EditText[1]")
    private MobileElement FeetByXpath;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.widget.EditText[2]")
    private MobileElement InchByXpath;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.widget.EditText[3]")
    private MobileElement WeightByXpath;
    @AndroidFindBy(accessibility = "SAVE DETAILS")
    private MobileElement SaveDetailsById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "No")
    private MobileElement ConcurrentPolicyByID;
    public InsuredDetails Self(){
        click(SelfByXpath);
        return this;
    }
    public InsuredDetails MaritialStatus(){
        click(MaritialStatusById);
        return this;
    }
    public InsuredDetails FirstName() throws InterruptedException {
        click(FirstNameByXpath);
        Thread.sleep(2000);
        sendKeys(FirstNameByXpath, "Xyz");
        Thread.sleep(4000);
        return this;
    }
    public InsuredDetails LastName() throws InterruptedException {
        click(LastNameByXpath);
        Thread.sleep(2000);
        sendKeys(LastNameByXpath, "Abc");
        Thread.sleep(4000);
        return this;
    }
    public InsuredDetails DOB() {
        click(DOBById);
        return this;
    }
    public InsuredDetails Confirm() throws InterruptedException {
        click(ConfirmById);
        Thread.sleep(3000);
//        driver.navigate().back();
        return this;
    }
    public InsuredDetails Occupation(){
        click(OccupationById);
        return this;
    }
    public InsuredDetails SelectOccupation(){
        click(SelectOccupationById);
        return this;
    }
    public InsuredDetails Feet() throws InterruptedException {
        scrollToEnd();
        Thread.sleep(4000);
        click(FeetByXpath);
        Thread.sleep(5000);
        back();
        scrollToEnd();
//        driver.navigate().back();
        sendKeys(FeetByXpath, "5");
        Thread.sleep(6000);
        return this;
    }
    public InsuredDetails Inch() throws InterruptedException {
        back();
        scrollToEnd();
        click(InchByXpath);
        Thread.sleep(8000);
//        back();
//        scrollToEnd();
//        driver.navigate().back();
        sendKeys(InchByXpath, "8");
        Thread.sleep(6000);
        return this;
    }
    public InsuredDetails Weight() throws InterruptedException {
        back();
        scrollToEnd();
        click(WeightByXpath);
        Thread.sleep(8000);
//        back();
//        scrollToEnd();
//        driver.navigate().back();
        sendKeys(WeightByXpath, "50");
        Thread.sleep(6000);
        return this;
    }
    public InsuredDetails SaveDetails(){
        back();
        click(SaveDetailsById);
        return this;
    }
    public InsuredDetails Next(){
        click(NextById);
        return this;
    }
    public InsuredDetails ConcurrentPolicy(){
        click(ConcurrentPolicyByID);
        return this;
    }
}
