package Pages.HealthEdge;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class HEHomeScreen extends BaseTest {
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
    @AndroidFindBy(accessibility = "HEALTH EDGE")
    private MobileElement HealthEdgeById;

    public HEHomeScreen No() throws InterruptedException{
        Thread.sleep(50000);
        click(noButton);
        return this;
    }
    public HEHomeScreen Skip(){
        click(skipButton);
        return this;
    }
    public HEHomeScreen PopUp(){
        click(popup);
        return this;
    }
    public HEHomeScreen HealthEdge(){
        click(HealthEdgeById);
        return this;
    }
}
