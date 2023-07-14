package Pages.Health.PersonalAccident;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import qa.BaseTest;
import utils.TestUtils;

public class InsuredDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    WebDriver driver;
    @AndroidFindBy(accessibility = "Unmarried")
    private MobileElement MaritialStatusById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'FIRST NAME']")
    private MobileElement FirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement LastNameByXpath;
    @AndroidFindBy(accessibility = "SAVE DETAILS")
    private MobileElement SaveDetailsById;
    public InsuredDetails MaritialStatus(){
        click(MaritialStatusById);
        return this;
    }
    public InsuredDetails FirstName() throws InterruptedException {
        click(FirstNameByXpath);
        Thread.sleep(2000);
        sendKeys(FirstNameByXpath, "Annu");
        Thread.sleep(4000);
        return this;
    }
    public InsuredDetails LastName() throws InterruptedException {
        click(LastNameByXpath);
        Thread.sleep(2000);
        sendKeys(LastNameByXpath, "Shaw");
        Thread.sleep(4000);
        return this;
    }
    public InsuredDetails SaveDetails() throws InterruptedException {
//        driver.navigate().back();
        Thread.sleep(2000);
        click(SaveDetailsById);
        return this;
    }
}
