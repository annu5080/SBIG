package Pages;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProposerDetails {
    private AppiumDriver appiumDriver;
    private final By PanNumberByXpath = By.xpath("//android.widget.EditText[@text='PAN NUMBER*']");
    private final By OccupationById = new AppiumBy.ByAccessibilityId("Type of Occupation");
    private final By SelectOccupationById = new AppiumBy.ByAccessibilityId("Self Employed");
    private final By PDNextById = new AppiumBy.ByAccessibilityId("NEXT");
    public ProposerDetails(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public WebElement PanNumber(){
        return appiumDriver.findElement(PanNumberByXpath);
    }
    public WebElement Occupation(){
        return appiumDriver.findElement(OccupationById);
    }
    public WebElement SelectOccupation(){
        return appiumDriver.findElement(SelectOccupationById);
    }
    public WebElement PDNext(){
        return appiumDriver.findElement(PDNextById);
    }
}
