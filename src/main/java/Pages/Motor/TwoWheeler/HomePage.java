package Pages.Motor.TwoWheeler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class HomePage extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    private AppiumDriver appiumDriver;
    @AndroidFindBy(accessibility ="No")
    private MobileElement noButton;
    @AndroidFindBy(accessibility = "SKIP")
    private MobileElement skipButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@index = '0']" )
    private MobileElement popup;
    @AndroidFindBy(accessibility = "MOTOR")
    private MobileElement MotorById;

    public HomePage No() throws InterruptedException {
        Thread.sleep(30000);
        click(noButton);
        return this;
    }
    public HomePage Skip(){
        click(skipButton);
        return this;
    }
    public HomePage PopUp(){
        click(popup);
        return this;
    }
    public HomePage Motor(){
        click(MotorById);
        return this;
    }
}
