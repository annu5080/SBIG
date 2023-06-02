package Pages;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen {
    private AppiumDriver appiumDriver;
    private final By HamburgerSelByXpath = By.xpath("//android.widget.ImageView[@index='1']");
    private final By BuyHealthInsuranceByID = new AppiumBy.ByAccessibilityId("Buy Health Insurance");
    private final By ArogyaSupremeById = new AppiumBy.ByAccessibilityId("Arogya Supreme");
    private final By NextByXpath = By.xpath("//android.widget.ImageView[@content-desc=\"NEXT\"]");
    private final By OKGotItById = new AppiumBy.ByAccessibilityId("OK, GOT IT");
    private final By GetQuoteById = new AppiumBy.ByAccessibilityId("GET QUOTE");

    public HomeScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public WebElement Hamburger() {
        return appiumDriver.findElement(HamburgerSelByXpath);
    }
    public WebElement BuyHealthInsurance() {
        return appiumDriver.findElement(BuyHealthInsuranceByID);
    }
    public WebElement ArogyaSupreme() {
        return appiumDriver.findElement(ArogyaSupremeById);
    }
    public WebElement next() {
        return appiumDriver.findElement(NextByXpath);
    }
    public WebElement OKGotIt() {
        return appiumDriver.findElement(OKGotItById);
    }
    public WebElement GetQuote(){
        return appiumDriver.findElement(GetQuoteById);
    }
}
