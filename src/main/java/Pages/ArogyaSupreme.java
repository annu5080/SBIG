package Pages;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArogyaSupreme {
    private AppiumDriver appiumDriver;

    private final By CompareById = new AppiumBy.ByAccessibilityId("COMPARE");
    private final By SelectPlanByXpath = By.xpath("(//android.widget.Button[@content-desc=\"SELECT\"])[1]");
    private final By PolicyTypeById = new AppiumBy.ByAccessibilityId("Individual\nGet hospitalisation cover for you or your family member\nIdeal for:  One family member");
    public ArogyaSupreme(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public WebElement Compare(){
        return appiumDriver.findElement(CompareById);
    }
    public WebElement SelectPlan(){
        return appiumDriver.findElement(SelectPlanByXpath);
    }
    public WebElement PolicyType(){
        return appiumDriver.findElement(PolicyTypeById);
    }
}
