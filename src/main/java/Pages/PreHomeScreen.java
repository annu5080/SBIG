package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;
import utils.TestUtils;

public class PreHomeScreen extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();



    private AppiumDriver appiumDriver;
    private final By noSelById = new AppiumBy.ByAccessibilityId("No");
    private final By skipSelById = new AppiumBy.ByAccessibilityId("SKIP");;
    private final By popupSelByXPATH = By.xpath("//android.widget.Button[@index = '0']");

    public PreHomeScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public WebElement No() {
        return appiumDriver.findElement(noSelById);
    }

    public WebElement Skip() {
        return appiumDriver.findElement(skipSelById);
    }

    public WebElement PopUp() {
        return appiumDriver.findElement(popupSelByXPATH);
    }

}
