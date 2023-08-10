package Pages.CyberVaultEdge;

import Pages.Health.ArogyaPlus.HomePage;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
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
    @AndroidFindBy(accessibility = "CYBER VAULTEDGE")
    private MobileElement CyberVaultEdgeById;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]")
    private MobileElement HamburgerById;
    @AndroidFindBy(accessibility = "Renew Policy")
    private MobileElement RenewPolicyByid;
    public MobileElement scroll(){
        return (MobileElement) ((FindsByAndroidUIAutomator) getDriver()).findElementByAndroidUIAutomator(

                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\" "+ RenewPolicyByid.getWrappedDriver()+"\").instance(0))");
    }

    public HomeScreen No() throws InterruptedException {
        Thread.sleep(50000);
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
    public HomeScreen CyberVaultEdge(){
        click(CyberVaultEdgeById);
        return this;
    }
    public HomeScreen Hamburger(){
        click(HamburgerById);
        return this;
    }
    public HomeScreen Renew() throws InterruptedException {
        Thread.sleep(4000);
//        (new TouchAction(getDriver()))
//                .press(PointOption.point(565, 1669}))
//            .moveTo(PointOption.point(565, 619}))
//        .release()
//        .perform();
//        scrollTo("Renew Policy");
//        scroll();
        click(RenewPolicyByid);
        return this;
    }
}
