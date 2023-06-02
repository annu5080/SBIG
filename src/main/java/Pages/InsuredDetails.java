package Pages;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InsuredDetails {
    private AppiumDriver appiumDriver;
    private final By SelfById = new AppiumBy.ByAccessibilityId("Self");
    private final By IdGenderByXpath = By.xpath("//android.widget.ImageView[@index='4']");
    private final By IDAgeById = new AppiumBy.ByAccessibilityId("Age");
    private final By SelectAgeById = new AppiumBy.ByAccessibilityId("22 years");
    private final By IDNextById = new AppiumBy.ByAccessibilityId("NEXT");
    private final By SumInsuredAmountById = new AppiumBy.ByAccessibilityId("₹3 Lakhs");
    private final By CoveragePackageByXpath = By.xpath("//android.widget.Button[@index='2']");
    private final By CoveragePeriodById = new AppiumBy.ByAccessibilityId("1 Year\n₹7,043");
    private final By ReviewQuoteById = new AppiumBy.ByAccessibilityId("PROCEED TO BUY");
    private final By UnmarriedById = new AppiumBy.ByAccessibilityId("Unmarried");
    private final By IDFirstNameByXpath = By.xpath("//android.widget.EditText[@text='FIRST NAME']");
    private final By IDLastNameByXpath = By.xpath("//android.widget.EditText[@text='LAST NAME']");
    private final By IDDOBByXpath = By.xpath("//android.widget.ImageView[@index='4']");
    private final By IDConfirmById = new AppiumBy.ByAccessibilityId("CONFIRM");
    private final By IDSaveDetailsById = new AppiumBy.ByAccessibilityId("SAVE DETAILS");

    public InsuredDetails(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public WebElement Self(){
        return appiumDriver.findElement(SelfById);
    }
    public WebElement IDGender(){
        return appiumDriver.findElement(IdGenderByXpath);
    }
    public WebElement IDAge(){
        return appiumDriver.findElement(IDAgeById);
    }
    public WebElement SelectIDAge(){
        return appiumDriver.findElement(SelectAgeById);
    }
    public WebElement IDNext(){
        return appiumDriver.findElement(IDNextById);
    }
    public WebElement SumInsuredAmount(){
        return appiumDriver.findElement(SumInsuredAmountById);
    }
    public WebElement CoveragePackage(){
        try {
            Thread.sleep(3000);
            return appiumDriver.findElement(CoveragePackageByXpath);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public WebElement CoveragePeriod(){
        return appiumDriver.findElement(CoveragePeriodById);
    }
    public WebElement ReviewQuote(){
        return appiumDriver.findElement(ReviewQuoteById);
    }
    public WebElement Unmarried(){
        return appiumDriver.findElement(UnmarriedById);
    }
    public WebElement IDFirstName(){
        return appiumDriver.findElement(IDFirstNameByXpath);
    }
    public WebElement IDLastName(){
        return appiumDriver.findElement(IDLastNameByXpath);
    }
    public WebElement IDDOB(){
        return appiumDriver.findElement(IDDOBByXpath);
    }
    public WebElement IDConfirm(){
        return appiumDriver.findElement(IDConfirmById);
    }
    public WebElement IDSaveDetails(){
        return appiumDriver.findElement(IDSaveDetailsById);
    }

}
