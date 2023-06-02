package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PersonalDetails {
    private AppiumDriver appiumDriver;
    private final By MobileNumberByXpath = By.xpath("//android.widget.EditText[@text='MOBILE NUMBER']");
    private final By EmailIdByXpath = By.xpath("//android.widget.EditText[@text='EMAIL ADDRESS']");
    private final By PinCodeByXpath = By.xpath("//android.widget.EditText[@text='My Pincode is']");
    private final By NextById = new AppiumBy.ByAccessibilityId("NEXT");
    private final By PinCodeSelById = new AppiumBy.ByAccessibilityId("110001");

    public PersonalDetails(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public WebElement MobileNumber(){
        return appiumDriver.findElement(MobileNumberByXpath);
    }
    public WebElement EmailId(){
        return appiumDriver.findElement(EmailIdByXpath);
    }
    public WebElement Next(){
        return appiumDriver.findElement(NextById);
    }
    public WebElement PinCode(){
        return appiumDriver.findElement(PinCodeByXpath);
    }
    public WebElement SelectPincode(){
        return appiumDriver.findElement(PinCodeSelById);
    }
}
