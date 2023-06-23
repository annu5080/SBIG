package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qa.BaseTest;
import utils.TestUtils;

public class HomeScreen extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='1']")
    private MobileElement HamburgerByXpath;
    @AndroidFindBy(accessibility = "Buy Health Insurance")
    private MobileElement BuyHealthInsuranceById;
    @AndroidFindBy(accessibility = "Arogya Supreme")
    private MobileElement ArogyaSupremeById;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"NEXT\"]")
    private MobileElement NextByXpath;
    @AndroidFindBy(accessibility = "OK, GOT IT")
    private MobileElement OkGotItById;
    @AndroidFindBy(accessibility = "GET QUOTE")
    private MobileElement GetQuoteById;

    public HomeScreen Hamburger() throws InterruptedException {
        Thread.sleep(5000);
        click(HamburgerByXpath);
        return this;
    }
    public HomeScreen BuyHealthInsurance() throws InterruptedException {
        click(BuyHealthInsuranceById);
        Thread.sleep(2000);
        return this;
    }
    public HomeScreen ArogyaSupreme(){
        click(ArogyaSupremeById);
        return this;
    }
    public HomeScreen next(){
        click(NextByXpath);
        return this;
    }
    public HomeScreen OKGotIt(){
        click(OkGotItById);
        return this;
    }
    public HomeScreen GetQuote(){
        click(GetQuoteById);
        return this;
    }
}
