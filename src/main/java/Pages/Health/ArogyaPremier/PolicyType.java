package Pages.Health.ArogyaPremier;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

import java.util.Base64;

public class PolicyType extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    @AndroidFindBy(accessibility = "Individual\n" + "Get hospitalisation cover for you or your family member\n" + "Ideal for:  One family member")
    private MobileElement SelectPolicyTypeById;
    @AndroidFindBy(accessibility = "Self")
    private MobileElement SelfById;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='4']")
    private MobileElement GenderByXpath;
    @AndroidFindBy(accessibility = "Age")
    private MobileElement AgeById;
    @AndroidFindBy(accessibility = "21 years")
    private MobileElement SelectAgeById;


    public PolicyType SelectPolicy(){
        click(SelectPolicyTypeById);
        return this;
    }
    public PolicyType Self(){
        click(SelfById);
        return this;
    }
    public PolicyType Gender(){
        click(GenderByXpath);
        return this;
    }
    public PolicyType Age(){
        click(AgeById);
        return this;
    }
    public PolicyType SelectAge(){
        click(SelectAgeById);
        return this;
    }
}
