package Pages.Health.PersonalAccident;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import qa.BaseTest;
import utils.TestUtils;

public class HealthQuestinare extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    WebDriver driver;
    @AndroidFindBy(accessibility = "No")
    private MobileElement PersonalAccidentById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[1]")
    private MobileElement HealthQuestionare1ByXpath;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[2]")
    private MobileElement HealthQuestionare2ByXpath;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[3]")
    private MobileElement HealthQuestionare3ByXpath;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[4]")
    private MobileElement HealthQuestionare4ByXpath;
    public HealthQuestinare PersonalAccident(){
        click(PersonalAccidentById);
        return this;
    }
    public HealthQuestinare Next(){
        click(NextById);
        return this;
    }
    public HealthQuestinare HealthQuestionare1(){
        click(HealthQuestionare1ByXpath);
        return this;
    }
    public HealthQuestinare HealthQuestionare2(){
        click(HealthQuestionare2ByXpath);
        return this;
    }
    public HealthQuestinare HealthQuestionare3(){
        click(HealthQuestionare3ByXpath);
        return this;
    }
    public HealthQuestinare HealthQuestionare4(){
        click(HealthQuestionare4ByXpath);
        return this;
    }
}
