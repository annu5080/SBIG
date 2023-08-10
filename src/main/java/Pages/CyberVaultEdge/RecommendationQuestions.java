package Pages.CyberVaultEdge;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class RecommendationQuestions extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"YES\"])[1]")
    private MobileElement Question1ByXpath;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"YES\"])[2]")
    private MobileElement Question2ByXpath;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"YES\"])[3]")
    private MobileElement Question3ByXpath;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"YES\"])[4]")
    private MobileElement Question4ByXpath;
    @AndroidFindBy(accessibility = "Skip to the Plans")
    private MobileElement SkipToThePlansById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    public RecommendationQuestions Question1(){
        click(Question1ByXpath);
        return this;
    }
    public RecommendationQuestions Question2(){
        click(Question2ByXpath);
        return this;
    }
    public RecommendationQuestions Question3() throws InterruptedException {
        Thread.sleep(2000);
        scrollToEnd();
        Thread.sleep(2000);
        click(Question3ByXpath);
        return this;
    }
    public RecommendationQuestions Question4(){
        click(Question4ByXpath);
        return this;
    }
    public RecommendationQuestions SkipToThePlans(){
        click(SkipToThePlansById);
        return this;
    }
    public RecommendationQuestions Next(){
        click(NextById);
        return this;
    }
}
