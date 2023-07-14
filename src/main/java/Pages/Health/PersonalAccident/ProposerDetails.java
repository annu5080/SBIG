package Pages.Health.PersonalAccident;

import io.appium.java_client.MobileElement;
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
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "SELECT AREA(DELHI)")
    private MobileElement SelectAreaById;
    @AndroidFindBy(accessibility = "Bengali Market")
    private MobileElement BengaliMarketById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PLOT/DOOR NUMBER']")
    private MobileElement PlotDoorNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='BUILDING/APARTMENT NAME']")
    private MobileElement BuildingApartmentNumberById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='STREET NAME']")
    private MobileElement StreetNameByXpath;
    public ProposerDetails PanNumber() throws InterruptedException {
        Thread.sleep(4000);
        click(PanNumberByXpath);
        Thread.sleep(2000);
        sendKeys(PanNumberByXpath, "ABCDE1234F");
        Thread.sleep(4000);
        return this;
    }
    public ProposerDetails Next() throws InterruptedException {
//        driver.navigate().back();
        Thread.sleep(6000);
        scrollToEnd();
        click(NextById);
        Thread.sleep(10000);
        return this;
    }
    public ProposerDetails SelectArea() throws InterruptedException {
//        driver.navigate().back();
        Thread.sleep(2000);
        click(SelectAreaById);
        return this;
    }
    public ProposerDetails BengaliMarket(){
        click(BengaliMarketById);
        return this;
    }
    public ProposerDetails PlotDoorNumber() throws InterruptedException {
        click(PlotDoorNumberByXpath);
        Thread.sleep(2000);
        sendKeys(PlotDoorNumberByXpath, "121");
        return this;
    }
    public ProposerDetails BuildingApartmentName() throws InterruptedException {
        click(BuildingApartmentNumberById);
        Thread.sleep(2000);
        sendKeys(BuildingApartmentNumberById, "Abbc");
        return this;
    }
    public ProposerDetails StreetName() throws InterruptedException {
        Thread.sleep(4000);
        click(StreetNameByXpath);
        Thread.sleep(2000);
        sendKeys(StreetNameByXpath, "Zeeee");
        return this;
    }
}
