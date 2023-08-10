package Pages.Motor.PrivateCar;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class CommunicationDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    private AppiumDriver appiumDriver;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PINCODE']")
    private MobileElement PincodeByXpath;
    @AndroidFindBy(accessibility = "SELECT AREA(DELHI)")
    private MobileElement SelectAreaById;
    @AndroidFindBy(accessibility = "Bengali Market")
    private MobileElement BengaliMarketById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PLOT/DOOR NUMBER']")
    private MobileElement PlotDoorNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='BUILDING/APARTMENT NAME']")
    private MobileElement BuildingApartmentNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='STREET NAME']")
    private MobileElement StreetNameByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "No")
    private MobileElement EIANumberById;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='3']")
    private MobileElement SelectEIANumberByXpath;

    public CommunicationDetails Pincode() throws InterruptedException {
        click(PincodeByXpath);
        Thread.sleep(2000);
        sendKeys(PincodeByXpath, "110001");
        Thread.sleep(2000);
        return this;
    }
    public CommunicationDetails SelectArea(){
        click(SelectAreaById);
        return this;
    }
    public CommunicationDetails BengaliMarket(){
        click(BengaliMarketById);
        return this;
    }
    public CommunicationDetails PlotDoorNumber() throws InterruptedException {
        click(PlotDoorNumberByXpath);
        Thread.sleep(2000);
        sendKeys(PlotDoorNumberByXpath, "121");
        Thread.sleep(2000);
        return this;
    }
    public CommunicationDetails BuildingApartmentName() throws InterruptedException {
        click(BuildingApartmentNumberByXpath);
        Thread.sleep(2000);
        sendKeys(BuildingApartmentNumberByXpath, "Abbc");
        Thread.sleep(2000);
        back();
        return this;
    }
    public CommunicationDetails StreetName() throws InterruptedException {
        click(StreetNameByXpath);
        Thread.sleep(2000);
        sendKeys(StreetNameByXpath, "Caaba");
        Thread.sleep(2000);
        back();
        return this;
    }
    public CommunicationDetails Next(){
        click(NextById);
        return this;
    }
    public CommunicationDetails EIANumber(){
        click(EIANumberById);
        return this;
    }
    public CommunicationDetails SelectEIANumber(){
        click(SelectEIANumberByXpath);
        return this;
    }
}
