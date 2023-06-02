package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HealthQuestionare {
    private AppiumDriver appiumDriver;
    private final By AnyOtherPolicyByID = new AppiumBy.ByAccessibilityId("No");
    private final By NextById = new AppiumBy.ByAccessibilityId("NEXT");
    private final By No1ByXpath = By.xpath(("(//android.widget.ImageView[@content-desc=\"NO\"])[1]"));
    private final By No2ByXpath = By.xpath("(//android.widget.ImageView[@content-desc=\"NO\"])[2]");
    private final By No3ByXpath = By.xpath("(//android.widget.ImageView[@content-desc=\"NO\"])[3]");
    private final By No4ByXpath = By.xpath("(//android.widget.ImageView[@content-desc=\"NO\"])[4]");
    private final By No5ByXpath = By.xpath("(//android.widget.ImageView[@content-desc=\"NO\"])[5]");
    public HealthQuestionare(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public WebElement AnyOtherPolicy(){
        return appiumDriver.findElement(AnyOtherPolicyByID);
    }
    public WebElement Next(){
        return appiumDriver.findElement(NextById);
    }
    public WebElement No1(){
        return appiumDriver.findElement(No1ByXpath);
    }
    public WebElement No2(){
        return appiumDriver.findElement(No2ByXpath);
    }
    public WebElement No3(){
        return appiumDriver.findElement(No3ByXpath);
    }
    public WebElement No4(){
        return appiumDriver.findElement(No4ByXpath);
    }
    public WebElement No5(){
        return appiumDriver.findElement(No5ByXpath);
    }
}
