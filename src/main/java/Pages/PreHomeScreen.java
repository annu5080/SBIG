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
    @AndroidFindBy(id ="No")
    private MobileElement noButton;
    @AndroidFindBy(id = "SKIP")
    private MobileElement skipButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@index = '0']" )
    private MobileElement popup;

    public PreHomeScreen No() {
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
