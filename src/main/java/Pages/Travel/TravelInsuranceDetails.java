package Pages.Travel;

import com.beust.ah.A;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class TravelInsuranceDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    @AndroidFindBy(accessibility = "Single Trip\n" + "COVER DURATION : 2 TO 180 DAYS")
    private MobileElement TripTypeById;
    @AndroidFindBy(accessibility ="From\n" + "dd mm,yyyy")
    private MobileElement FromById;
    @AndroidFindBy(accessibility = "CONFIRM")
    private MobileElement ConfirmById;
    @AndroidFindBy(accessibility = "To\n" + "dd mm,yyyy")
    private MobileElement ToById;
    @AndroidFindBy(accessibility = "10")
    private MobileElement SelectEndDateById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "No")
    private MobileElement DestinationById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    private MobileElement SearchCountryByXpath;
    @AndroidFindBy(accessibility = "AMERICAN SAMOA")
    private MobileElement SelectCountryById;
    @AndroidFindBy(accessibility = "SAVE DETAILS")
    private MobileElement SaveDetailsById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='2']")
    private MobileElement ContactDetailsByXpath;
    @AndroidFindBy(accessibility = "Self")
    private MobileElement TravellerById;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[3]")
    private MobileElement GenderByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='FIRST NAME']")
    private MobileElement FirstNameByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='LAST NAME']")
    private MobileElement LastNameByXpath;
    @AndroidFindBy(accessibility = "DD/MM/YYYY")
    private MobileElement DOBById;
    @AndroidFindBy(accessibility = "1990")
    private MobileElement SelectYearById;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='PASSPORT NUMBER']")
    private MobileElement PassportNumberByXpath;
    @AndroidFindBy(accessibility = "All the travellers will be travelling from India.")
    private MobileElement ConsentByXpath;

    public TravelInsuranceDetails TripType(){
        click(TripTypeById);
        return this;
    }
    public TravelInsuranceDetails StartDateFrom(){
        click(FromById);
        return this;
    }
    public TravelInsuranceDetails Confirm(){
        click(ConfirmById);
        return this;
    }
    public TravelInsuranceDetails EndDateTo(){
        click(ToById);
        return this;
    }
    public TravelInsuranceDetails SelectEndDate() throws InterruptedException {
        Thread.sleep(4000);
        scrollToEnd();
        click(SelectEndDateById);
        return this;
    }
    public TravelInsuranceDetails Next(){
        click(NextById);
        return this;
    }
    public TravelInsuranceDetails Destination(){
        click(DestinationById);
        return this;
    }
    public TravelInsuranceDetails SearchCountry() throws InterruptedException {
        click(SearchCountryByXpath);
        Thread.sleep(2000);
        sendKeys(SearchCountryByXpath, "am");
        Thread.sleep(2000);
        return this;
    }
    public TravelInsuranceDetails SelectCountry(){
        click(SelectCountryById);
        return this;
    }
    public TravelInsuranceDetails SaveDetails(){
        click(SaveDetailsById);
        return this;
    }
    public TravelInsuranceDetails ContactDetails() throws InterruptedException {
        Thread.sleep(6000);
        back();
        click(ContactDetailsByXpath);
        Thread.sleep(2000);
        sendKeys(ContactDetailsByXpath, "9876543210");
        Thread.sleep(2000);
        return this;
    }
    public TravelInsuranceDetails EmailAddress() throws InterruptedException {
        Thread.sleep(6000);
        back();
        click(ContactDetailsByXpath);
        Thread.sleep(2000);
        sendKeys(ContactDetailsByXpath, "a@gmail.com");
        Thread.sleep(2000);
        return this;
    }
    public TravelInsuranceDetails Traveller(){
        click(TravellerById);
        return this;
    }
    public TravelInsuranceDetails Gender(){
        click(GenderByXpath);
        return this;
    }
    public TravelInsuranceDetails FirstName() throws InterruptedException {
        click(FirstNameByXpath);
        Thread.sleep(2000);
        sendKeys(FirstNameByXpath, "Abbc");
        Thread.sleep(2000);
        back();
        return this;
    }
    public TravelInsuranceDetails LastName() throws InterruptedException {
        click(LastNameByXpath);
        Thread.sleep(2000);
        sendKeys(LastNameByXpath, "Abbc");
        Thread.sleep(2000);
        back();
        return this;
    }
    public TravelInsuranceDetails DOB(){
        click(DOBById);
        return this;
    }
    public TravelInsuranceDetails SelectYear() throws InterruptedException {
        Thread.sleep(10000);
        click(SelectYearById);
        return this;
    }
    public TravelInsuranceDetails PassportNumber() throws InterruptedException {
        scrollToEnd();
        click(PassportNumberByXpath);
        Thread.sleep(2000);
        sendKeys(PassportNumberByXpath, "N1234567");
        Thread.sleep(2000);
        back();
        return this;
    }
    public TravelInsuranceDetails Consent() throws InterruptedException {
        Thread.sleep(6000);
        return this;
    }
}
