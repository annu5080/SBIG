package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import qa.BaseTest;
import utils.TestUtils;

public class ProposerDetails extends BaseTest {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    WebDriver driver;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PAN NUMBER*']")
    private MobileElement PanNumberByXpath;
    @AndroidFindBy(accessibility = "Type of Occupation")
    private MobileElement OccupationById;
    @AndroidFindBy(accessibility = "Self Employed")
    private MobileElement SelectOccupationById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement PDNextById;

    public ProposerDetails PanNumber() throws InterruptedException {
        click(PanNumberByXpath);
        Thread.sleep(2000);
//        driver.navigate().back();
        sendKeys(PanNumberByXpath, "ABCDE1234F");
        Thread.sleep(2000);
//        driver.navigate().back();
        scrollToEnd();
        return this;
    }

    public ProposerDetails Occupation() {
        click(OccupationById);
        return this;
    }

    public ProposerDetails SelectOccupation() throws InterruptedException {
        click(SelectOccupationById);
        Thread.sleep(6000);
//        driver.navigate().back();
        scrollToEnd();
        Thread.sleep(4000);
        return this;
    }

    public ProposerDetails PDNext() {
        click(PDNextById);
        return this;
    }
}
