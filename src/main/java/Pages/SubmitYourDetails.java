package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import qa.BaseTest;
import utils.TestUtils;

public class SubmitYourDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    WebDriver driver;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"UPLOAD\"]")
    private MobileElement UploadByXpath;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"File Manager\"]")
    private MobileElement FileMangerByXpath;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index=\"0\"]")
    private MobileElement SelectPhotoByXpath;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"PROCEED\"]")
    private MobileElement ProceedByXpath;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Id Proof\"]")
    private MobileElement IDProofByXpath;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"PASSPORT\"]")
    private MobileElement PassportByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index=\"3\"]")
    private MobileElement PassportNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add Files\"]")
    private MobileElement AddFilesByXpath;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"SUBMIT\"]")
    private MobileElement SubmitByXpath;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]")
    private MobileElement NextByXpath;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"VERIFY OTP\"]")
    private MobileElement VerifyOtpByXpath;
    public SubmitYourDetails Upload(){
        click(UploadByXpath);
        return this;
    }
    public SubmitYourDetails FileManger() throws InterruptedException {
        click(FileMangerByXpath);
        Thread.sleep(25000);
        return this;
    }
    public SubmitYourDetails SelectPhoto() throws InterruptedException {
        click(SelectPhotoByXpath);
        Thread.sleep(25000);
        scrollToEnd();
        return this;
    }
    public SubmitYourDetails Proceed() throws InterruptedException {
        click(ProceedByXpath);
        Thread.sleep(10000);
        scrollToEnd();
        return this;
    }
    public SubmitYourDetails IDProof(){
        click(IDProofByXpath);
        return this;
    }
    public SubmitYourDetails Passport(){
        click(PassportByXpath);
        return this;
    }
    public SubmitYourDetails PassportNumber() throws InterruptedException {
        click(PassportNumberByXpath);
        sendKeys(PassportNumberByXpath, "N1234567");
        Thread.sleep(2000);
        driver.navigate().back();
        return this;
    }
    public SubmitYourDetails AddFiles(){
        click(AddFilesByXpath);
        return this;
    }
    public SubmitYourDetails Submit(){
        click(AddFilesByXpath);
        return this;
    }
    public SubmitYourDetails Next(){
        click(AddFilesByXpath);
        return this;
    }
    public SubmitYourDetails VerifyOtp(){
        click(AddFilesByXpath);
        return this;
    }

}
