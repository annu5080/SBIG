package Pages.Motor.PrivateCar;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class RegistrationNumber extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    private AppiumDriver appiumDriver;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='KA']")
    private MobileElement MHByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='02']")
    private MobileElement NumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='KA']")
    private MobileElement KAByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='5678']")
    private MobileElement Number2ByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    public RegistrationNumber MH() throws InterruptedException {
        click(MHByXpath);
        Thread.sleep(2000);
        sendKeys(MHByXpath, "MH");
        Thread.sleep(2000);
        return this;
    }
    public RegistrationNumber Number() throws InterruptedException {
        click(NumberByXpath);
        Thread.sleep(2000);
        sendKeys(NumberByXpath, "14");
        Thread.sleep(2000);
        return this;
    }
    public RegistrationNumber KA() throws InterruptedException {
        click(KAByXpath);
        Thread.sleep(2000);
        sendKeys(KAByXpath, "FS");
        Thread.sleep(2000);
        return this;
    }
    public RegistrationNumber Number2() throws InterruptedException {
        click(Number2ByXpath);
        Thread.sleep(2000);
        sendKeys(Number2ByXpath, "1939");
        Thread.sleep(2000);
        return this;
    }
    public RegistrationNumber Next(){
        click(NextById);
        appiumDriver.navigate().back();
        return this;
    }
}
