package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PolicySummary {
    private AppiumDriver appiumDriver;
    private final By DoneByXpath = By.xpath("//android.widget.Button[@content-desc=\"DONE\"]");
    private final By ProceedWithKYCByXpath = By.xpath("//android.widget.Button[@content-desc=\"Proceed with KYC\"]");

    public PolicySummary(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public WebElement Done(){
        return appiumDriver.findElement(DoneByXpath);
    }
    public WebElement ProceedWithKYC(){
        return appiumDriver.findElement(ProceedWithKYCByXpath);
    }
}
