package Pages.Health.ArogyaSanjeevani;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class ProposerDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    private AppiumDriver appiumDriver;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PAN NUMBER*']")
    private MobileElement PanNumberByXpath;
    @AndroidFindBy(accessibility = "Type of Occupation")
    private MobileElement OccupationById;
    @AndroidFindBy(accessibility = "Self Employed")
    private MobileElement SelectOccupationById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PINCODE']")
    private MobileElement PincodeByXpath;
    @AndroidFindBy(accessibility = "SELECT AREA(DELHI)")
    private MobileElement SelectAreaById;
    @AndroidFindBy(accessibility = "Bengali Market")
    private MobileElement BengaliMarketById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PLOT/DOOR NUMBER']")
    private MobileElement PlotDoorNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='BUILDING/APARTMENT NAME']")
    private MobileElement BuildingApartmentNameBYXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='STREET NAME']")
    private MobileElement StreetNameByXpath;

    public ProposerDetails PanNumber() throws InterruptedException {
        click(PanNumberByXpath);
        Thread.sleep(2000);
        sendKeys(PanNumberByXpath, "ABCDE1234F");
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        return this;
    }
    public ProposerDetails Occupation(){
        scrollToEnd();
        click(OccupationById);
        return this;
    }
    public ProposerDetails SelectOccupation() throws InterruptedException {
        click(SelectOccupationById);
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        return this;
    }
    public ProposerDetails Next(){
        scrollToEnd();
        click(NextById);
        return this;
    }
    public ProposerDetails Pincode() throws InterruptedException {
        Thread.sleep(30000);
        sendKeys(PincodeByXpath, "110001");
        Thread.sleep(2000);
        return this;
    }
    public ProposerDetails SelectArea(){
        click(SelectOccupationById);
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
        click(BuildingApartmentNameBYXpath);
        Thread.sleep(2000);
        sendKeys(BuildingApartmentNameBYXpath, "Abbc");
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        return this;
    }
    public ProposerDetails StreetName() throws InterruptedException {
        click(StreetNameByXpath);
        Thread.sleep(2000);
        sendKeys(StreetNameByXpath, "Tuii");
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        return this;
    }
}
