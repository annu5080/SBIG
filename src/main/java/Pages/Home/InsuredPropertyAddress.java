package Pages.Home;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class InsuredPropertyAddress extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PLOT/DOOR NUMBER']")
    private MobileElement PlotDoorNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FLOOR NUMBER']")
    private MobileElement FloorNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='BUILDING/APARTMENT NAME']")
    private MobileElement BuildingApartmentNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='STREET NAME']")
    private MobileElement StreetNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PINCODE']")
    private MobileElement PincodeByXpath;
    @AndroidFindBy(accessibility = "SELECT AREA(DELHI)")
    private MobileElement SelectAreaById;
    @AndroidFindBy(accessibility = "Bengali Market")
    private MobileElement BengaliMarketById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    public InsuredPropertyAddress PlotDoorNumber() throws InterruptedException {
        click(PlotDoorNumberByXpath);
        Thread.sleep(2000);
        sendKeys(PlotDoorNumberByXpath, "121");
        Thread.sleep(2000);
        return this;
    }
    public InsuredPropertyAddress FloorNumber() throws InterruptedException {
        click(FloorNumberByXpath);
        Thread.sleep(2000);
        sendKeys(FloorNumberByXpath, "2");
        Thread.sleep(2000);
        return this;
    }
    public InsuredPropertyAddress BuildingApartmentName() throws InterruptedException {
        click(BuildingApartmentNameByXpath);
        Thread.sleep(2000);
        sendKeys(BuildingApartmentNameByXpath, "Abbc");
        Thread.sleep(2000);
        return this;
    }
    public InsuredPropertyAddress StreetName() throws InterruptedException {
        click(StreetNameByXpath);
        Thread.sleep(2000);
        sendKeys(StreetNameByXpath, "Abbcc");
        Thread.sleep(2000);
        return this;
    }
    public InsuredPropertyAddress Pincode() throws InterruptedException {
        back();
        click(PincodeByXpath);
        Thread.sleep(2000);
        sendKeys(PincodeByXpath, "110001");
        Thread.sleep(2000);
        return this;
    }
    public InsuredPropertyAddress SelectArea(){
        scrollToEnd();
        click(SelectAreaById);
        return this;
    }
    public InsuredPropertyAddress BengaliMarket() throws InterruptedException {
        Thread.sleep(2000);
        click(BengaliMarketById);
        return this;
    }
    public InsuredPropertyAddress Next(){
        click(NextById);
        return this;
    }
}
