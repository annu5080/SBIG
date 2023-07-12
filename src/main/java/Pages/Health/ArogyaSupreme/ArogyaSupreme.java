package Pages.Health.ArogyaSupreme;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class ArogyaSupreme extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    @AndroidFindBy(accessibility = "COMPARE")
    private MobileElement CompareById;
    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"SELECT\"])[1]")
    private MobileElement SelectPlanByXpath;
    @AndroidFindBy(accessibility = "Individual\nGet hospitalisation cover for you or your family member\nIdeal for:  One family member")
    private MobileElement PolicyTypeById;
    public ArogyaSupreme Compare() throws InterruptedException {
        click(CompareById);
        Thread.sleep(2000);
        scrollToEnd();
        return this;
    }
    public ArogyaSupreme SelectPlan() throws InterruptedException{
        click(SelectPlanByXpath);
        return this;
    }
    public ArogyaSupreme PolicyType(){
        click(PolicyTypeById);
        return this;
    }
}
