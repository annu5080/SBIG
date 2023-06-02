package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PDAddressPage {
    private AppiumDriver appiumDriver;
    private final By SelectAreaByXpath = By.xpath("//android.widget.Button[@content-desc=\"SELECT AREA\"]");
    private final By BengaliMarketByXpath = By.xpath("//android.view.View[@content-desc=\"Bengali Market\"]");
    private final By PlotNumberByXpath = By.xpath("//android.widget.EditText[@text='PLOT/DOOR NUMBER']");
    private final By BuildingApartmentNameByXpath = By.xpath("//android.widget.EditText[@text='BUILDING/APARTMENT NAME']");
    private final By StreetNameByXpath = By.xpath("//android.widget.EditText[@text='STREET NAME']");
    private final By PDANextById = new AppiumBy.ByAccessibilityId("NEXT");
    public PDAddressPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public WebElement SelectArea(){
        return appiumDriver.findElement(SelectAreaByXpath);
    }
    public WebElement BengaliMarket(){
        return appiumDriver.findElement(BengaliMarketByXpath);
    }
    public WebElement PlotNumber(){
        return appiumDriver.findElement(PlotNumberByXpath);
    }
    public WebElement BuildingApartmentName(){
        return appiumDriver.findElement(BuildingApartmentNameByXpath);
    }
    public WebElement StreetName(){
        return appiumDriver.findElement(StreetNameByXpath);
    }
    public WebElement PDANext(){
        return appiumDriver.findElement(PDANextById);
    }
}
