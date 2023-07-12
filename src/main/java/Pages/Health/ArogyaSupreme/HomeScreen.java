package Pages.Health.ArogyaSupreme;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class HomeScreen extends BaseTest {
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
    @AndroidFindBy(accessibility = "HEALTH")
    private MobileElement HealthById;

    public HomeScreen No() throws InterruptedException {
        Thread.sleep(30000);
        click(noButton);
        return this;
    }
    public HomeScreen Skip(){
        click(skipButton);
        return this;
    }
    public HomeScreen PopUp(){
        click(popup);
        return this;
    }
    public HomeScreen Health(){
        click(HealthById);
        return this;
    }
}