package Pages.CyberVaultEdge;

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
    private MobileElement BuildingApartmentNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='STREET NAME']")
    private MobileElement StreetNameByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextAddressById;
    @AndroidFindBy(accessibility = "No")
    private MobileElement EIANumberById;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='3']")
    private MobileElement SelectEIANumberByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextEIAById;
    @AndroidFindBy(accessibility = "DONE")
    private MobileElement DoneById;
    @AndroidFindBy(accessibility = "Proceed with KYC")
    private MobileElement ProceedWithKYCById;

    public ProposerDetails PanNumber() throws InterruptedException{
        click(PanNumberByXpath);
        Thread.sleep(5000);
        back();
        sendKeys(PanNumberByXpath, "ABCDE1234F");
        Thread.sleep(4000);
        return this;
    }
    public ProposerDetails Occupation() throws InterruptedException {
        back();
        scrollToEnd();
//        scrollTo("Type of Occupation");
        Thread.sleep(2000);
        click(OccupationById);
        return this;
    }
    public ProposerDetails SelectOccupation(){
        click(SelectOccupationById);
        return this;
    }
    public ProposerDetails Next() throws InterruptedException {
        Thread.sleep(6000);
        back();
        scrollToEnd();
//        scrollTo("NEXT");
        Thread.sleep(6000);
        click(NextById);
        Thread.sleep(30000);
        return this;
    }
    public ProposerDetails Pincode() throws InterruptedException {
        click(PincodeByXpath);
        Thread.sleep(2000);
        sendKeys(PincodeByXpath, "110001");
        Thread.sleep(2000);
        return this;
    }
    public ProposerDetails SelectArea(){
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
        Thread.sleep(2000);
        return this;
    }
    public ProposerDetails BuildingApartmentName() throws InterruptedException {
        click(BuildingApartmentNameByXpath);
        Thread.sleep(2000);
        sendKeys(BuildingApartmentNameByXpath, "Abbc");
        Thread.sleep(2000);
        return this;
    }
    public  ProposerDetails StreetName() throws InterruptedException {
        back();
        click(StreetNameByXpath);
        Thread.sleep(2000);
        sendKeys(StreetNameByXpath, "Abbxys");
        Thread.sleep(2000);
        return this;
    }
    public ProposerDetails NextAddress(){
        back();
        click(NextAddressById);
        return this;
    }
    public ProposerDetails EIANumber(){
        click(EIANumberById);
        return this;
    }
    public ProposerDetails SelectEIANumber(){
        click(SelectEIANumberByXpath);
        return this;
    }
    public ProposerDetails EIANext(){
        click(NextEIAById);
        return this;
    }
    public ProposerDetails Done() throws InterruptedException {
        scrollToEnd();
        Thread.sleep(4000);
        click(DoneById);
        return this;
    }
    public ProposerDetails ProceedWithKYC(){
        click(ProceedWithKYCById);
        return this;
    }
}
