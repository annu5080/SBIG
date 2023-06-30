package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import qa.BaseTest;
import utils.TestUtils;

public class PDAddressPage extends BaseTest {


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    WebDriver driver;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"SELECT AREA\"]")
    private MobileElement SelectAreaByXpath;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Bengali Market\"]")
    private MobileElement BengaliMarketByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PLOT/DOOR NUMBER']")
    private MobileElement PlotNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='BUILDING/APARTMENT NAME']")
    private MobileElement BuildingApartmentNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='STREET NAME']")
    private MobileElement StreetNameByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement PDANextById;
    public PDAddressPage SelectArea() throws InterruptedException {
        Thread.sleep(30000);
//        driver.navigate().back();
        click(SelectAreaByXpath);
        return this;
    }
    public PDAddressPage BengaliMarket(){
        click(BengaliMarketByXpath);
        return this;
    }
    public PDAddressPage PlotNumber() throws InterruptedException {
        click(PlotNumberByXpath);
        Thread.sleep(2000);
        sendKeys(PlotNumberByXpath, "121");
        return this;
    }
    public PDAddressPage BuildingApartmentName() throws InterruptedException {
        click(BuildingApartmentNameByXpath);
        Thread.sleep(2000);
        sendKeys(BuildingApartmentNameByXpath, "abcd");
        Thread.sleep(2000);
//        driver.navigate().back();
        return this;
    }
    public PDAddressPage StreetName() throws InterruptedException {
        click(StreetNameByXpath);
        Thread.sleep(2000);
        sendKeys(StreetNameByXpath, "tysm");
        Thread.sleep(4000);
//        driver.navigate().back();
        return this;
    }
    public PDAddressPage PDANext(){
        click(PDANextById);
        return this;
    }
}
