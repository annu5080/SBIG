package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SubmitYourDetails {
    private AppiumDriver appiumDriver;
    private final By UploadByXpath= By.xpath("//android.view.View[@content-desc=\"UPLOAD\"]");
    private final By FileMangerByXpath = By.xpath("//android.widget.ImageView[@content-desc=\"File Manager\"]");
    private final By SelectPhotoByXpath = By.xpath("//android.widget.ImageView[@index=\"0\"]");
    private final By ProceedByXpath = By.xpath("//android.widget.Button[@content-desc=\"PROCEED\"]");
    private final By IDProofByXpath = By.xpath("//android.widget.Button[@content-desc=\"Id Proof\"]");
    private final By PassportByXpath = By.xpath("//android.view.View[@content-desc=\"PASSPORT\"]");
    private final By PassportNumberByXpath = By.xpath("//android.widget.EditText[@index=\"3\"]");
    private final By AddFilesByXpath = By.xpath("//android.widget.ImageView[@content-desc=\"Add Files\"]");
    private final By SubmitByXpath = By.xpath("//android.widget.Button[@content-desc=\"SUBMIT\"]");
    private final By NextByXpath = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    private final By VerifyOtpByXpath = By.xpath("//android.widget.Button[@content-desc=\"VERIFY OTP\"]");
    public SubmitYourDetails(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public WebElement Upload(){
        return appiumDriver.findElement(UploadByXpath);
    }
    public WebElement FileManger(){
        return appiumDriver.findElement(FileMangerByXpath);
    }
    public WebElement SelectPhoto(){
        return appiumDriver.findElement(SelectPhotoByXpath);
    }
    public WebElement Proceed(){
        return appiumDriver.findElement(ProceedByXpath);
    }
    public WebElement IDProof(){
        return appiumDriver.findElement(IDProofByXpath);
    }
    public WebElement Passport(){
        return appiumDriver.findElement(PassportByXpath);
    }
    public WebElement PassportNumber(){
        return appiumDriver.findElement(PassportNumberByXpath);
    }
    public WebElement AddFiles(){
        return appiumDriver.findElement(AddFilesByXpath);
    }
    public WebElement Submit(){
        return appiumDriver.findElement(SubmitByXpath);
    }
    public WebElement Next(){
        return appiumDriver.findElement(NextByXpath);
    }
    public WebElement VerifyOtp(){
        return appiumDriver.findElement(VerifyOtpByXpath);
    }
}
