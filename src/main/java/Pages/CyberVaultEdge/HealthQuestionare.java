package Pages.CyberVaultEdge;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class HealthQuestionare extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[1]")
    private MobileElement HealthQuestionare1ByXpath;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[2]")
    private MobileElement HealthQuestionare2ByXpath;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[3]")
    private MobileElement HealthQuestionare3ByXpath;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[4]")
    private MobileElement HealthQuestionare4ByXpath;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;

    public HealthQuestionare HealthQuestionare1(){
        click(HealthQuestionare1ByXpath);
        return this;
    }
    public HealthQuestionare HealthQuestionare2(){
        click(HealthQuestionare2ByXpath);
        return this;
    }
    public HealthQuestionare HealthQuestionare3(){
        click(HealthQuestionare3ByXpath);
        return this;
    }
    public HealthQuestionare HealthQuestionare4() throws InterruptedException {
        scrollToEnd();
//        scrollTo("NO");
        Thread.sleep(2000);
        click(HealthQuestionare3ByXpath);
        return this;
    }
    public HealthQuestionare Next(){
        click(NextById);
        return this;
    }
}
