package Pages;

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
    @AndroidFindBy(accessibility = "No")
    private MobileElement AnyOtherPolicyByID;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[1]")
    private MobileElement No1ByXpath;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[2]")
    private MobileElement No2ByXpath;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[3]")
    private MobileElement No3ByXpath;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[4]")
    private MobileElement No4ByXpath;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"NO\"])[5]")
    private MobileElement No5ByXpath;
    public HealthQuestionare AnyOtherPolicy(){
        click(AnyOtherPolicyByID);
        return this;
    }
    public HealthQuestionare Next() throws InterruptedException {
        click(NextById);
        Thread.sleep(3000);
        return this;
    }
    public HealthQuestionare No1(){
        click(No1ByXpath);
        return this;
    }
    public HealthQuestionare No2(){
        click(No2ByXpath);
        return this;
    }
    public HealthQuestionare No3(){
        click(No3ByXpath);
        return this;
    }
    public HealthQuestionare No4(){
        click(No4ByXpath);
        return this;
    }
    public HealthQuestionare No5(){
        click(No5ByXpath);
        return this;
    }

}
