package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NomineeDetails {
    private AppiumDriver appiumDriver;
    private final By NDGenderByXpath = By.xpath("//android.widget.ImageView[@index='3']");
    private final By NDFirstNameByXpath = By.xpath("//android.widget.EditText[@text='FIRST NAME']");
    private final By NDLastNameByXpath = By.xpath("//android.widget.EditText[@text='LAST NAME']");
    private final By NomineeRelationByXpath = By.xpath("//android.widget.Button[@content-desc=\"Relation with primary insured\"]");
    private final By MotherByXpath = By.xpath("//android.view.View[@content-desc=\"Mother\"]");
    private final By NDOBByXpath = By.xpath("//android.widget.ImageView[@content-desc=\"DOB\n" +
            "DD/MM/YYYY\"]");
    private final By SelectYearById= new AppiumBy.ByAccessibilityId("2023");
    private final By YearById = new AppiumBy.ByAccessibilityId("1985");
    private final By NDConfirmByXpath =By.xpath("//android.widget.Button[@content-desc=\"CONFIRM\"]");
    private final By NDNextByXapth = By.xpath("//android.widget.Button[@content-desc=\"NEXT\"]");
    private final By EIANumberByXpath = By.xpath("//android.view.View[@content-desc=\"No\"]");
    private final By EIANumber1ByXpath = By.xpath("//android.widget.RadioButton[@index='3']");

    public NomineeDetails(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public WebElement NDGender(){
        return appiumDriver.findElement(NDGenderByXpath);
    }
    public WebElement NDFirstName(){
        return appiumDriver.findElement(NDFirstNameByXpath);
    }
    public WebElement NDLastName(){
        return appiumDriver.findElement(NDLastNameByXpath);
    }
    public WebElement NomineeRelation(){
        return appiumDriver.findElement(NomineeRelationByXpath);
    }
    public WebElement Mother(){
        return appiumDriver.findElement(MotherByXpath);
    }
    public WebElement NDOB(){
        return appiumDriver.findElement(NDOBByXpath);
    }
    public WebElement SelectYear(){
        return appiumDriver.findElement(SelectYearById);
    }
    public WebElement Year(){
        return appiumDriver.findElement(YearById);
    }
    public WebElement Confirm(){
        return appiumDriver.findElement(NDConfirmByXpath);
    }
    public WebElement NDNext(){
        return appiumDriver.findElement(NDNextByXapth);
    }
    public WebElement EIANumber(){
        return appiumDriver.findElement(EIANumberByXpath);
    }
    public WebElement EIANumber1(){
        return appiumDriver.findElement(EIANumber1ByXpath);
    }
}
