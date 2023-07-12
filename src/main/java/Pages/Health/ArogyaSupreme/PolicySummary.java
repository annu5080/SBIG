package Pages.Health.ArogyaSupreme;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class PolicySummary extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"DONE\"]")
    private MobileElement DoneByXpath;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Proceed with KYC\"]")
    private MobileElement ProceedWithKYCByXpath;
    public PolicySummary Done() throws InterruptedException {
        scrollToEnd();
        Thread.sleep(2000);
        scrollToEnd();
        click(DoneByXpath);
        return this;
    }
    public PolicySummary ProceedWithKYC(){
        click(ProceedWithKYCByXpath);
        return this;
    }
}
