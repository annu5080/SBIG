package Pages.HealthEdge;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import qa.BaseTest;
import utils.TestUtils;

public class PersonalDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='MOBILE NUMBER']")
    private MobileElement MobileNumberByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='EMAIL ADDRESS']")
    private MobileElement EmailAddressByXpath;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='acdbb!&!.@#.abcd@!#, EMAIL ADDRESS']")
    private MobileElement InvalidEmailAddressByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "Invalid email address")
    private MobileElement ErrorMessageByXpath;

    public PersonalDetails MobileNumber(){
        sendKeys(MobileNumberByXpath, "9876543210");
        return this;
    }
    public PersonalDetails EmailAddress() throws InterruptedException {

//        Thread.sleep(2000);
////        click(EmailAddressByXpath);
////        Thread.sleep(2000);
////        clear(EmailAddressByXpath);
//        Actions actions = new Actions((WebDriver) driver);
//        actions.click(EmailAddressByXpath).keyDown(Keys.CONTROL).keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
//        clearWebField(EmailAddressByXpath);
//        clear(EmailAddressByXpath);
//        clear(EmailAddressByXpath);
//        Thread.sleep(2000);

        sendKeys(EmailAddressByXpath, "a@gmail.com");


//        Thread.sleep(8000);
//        clear(InvalidEmailAddressByXpath);
//        click(NextById);
//        clear(EmailAddressByXpath);
        return this;
    }
//    public PersonalDetails Demo() throws InterruptedException {
//
//        Thread.sleep(10000);
////        back();
//        click(InvalidEmailAddressByXpath);
//        Thread.sleep(2000);
////        clear(InvalidEmailAddressByXpath);
//        return this;
//    }
    public PersonalDetails NegativeEmailAddress() throws InterruptedException {
        Thread.sleep(2000);
        sendKeys(EmailAddressByXpath, "acdbb!&!.@#.abcd@!#");
        Thread.sleep(2000);
        click(NextById);
        Thread.sleep(2000);
        MobileElement errorMessage = ErrorMessageByXpath;
        if (errorMessage.isDisplayed()) {
            Thread.sleep(2000);
            String errormessage = getText(errorMessage, "error");
            System.out.println("Error Message " + errormessage);
//            System.out.println("Invalid Email Address. Error message: " + errorMessage.getAttribute(String.valueOf(errorMessage)));
        } else {
            System.out.println("No invalid Test Data");
        }
        return this;
    }
    public PersonalDetails ClearInvalidEA() throws InterruptedException {
        Thread.sleep(2000);
        clear(InvalidEmailAddressByXpath);
        return this;
    }

    public PersonalDetails Next() throws InterruptedException {
        click(NextById);
        Thread.sleep(3000);
        return this;
    }
}
