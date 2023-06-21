package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import qa.BaseTest;
import utils.TestUtils;

public class PreHomeScreen extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    @AndroidFindBy(accessibility ="No")
    private MobileElement noButton;
    @AndroidFindBy(accessibility = "SKIP")
    private MobileElement skipButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@index = '0']" )
    private MobileElement popup;

    public PreHomeScreen No() throws InterruptedException {
        Thread.sleep(20000);
        click(noButton);
        return this;
    }
    public PreHomeScreen Skip(){
        click(skipButton);
        return this;
    }
    public PreHomeScreen PopUp(){
        click(popup);
        return this;
    }
}
